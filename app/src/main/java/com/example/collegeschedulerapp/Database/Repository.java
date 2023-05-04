package com.example.collegeschedulerapp.Database;

import android.app.Application;

import com.example.collegeschedulerapp.DAO.CourseDAO;
import com.example.collegeschedulerapp.DAO.ExamDAO;
import com.example.collegeschedulerapp.DAO.TermDAO;
import com.example.collegeschedulerapp.Entities.Course;
import com.example.collegeschedulerapp.Entities.Exam;
import com.example.collegeschedulerapp.Entities.Term;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Repository {
    private CourseDAO mcourseDAO;
    private ExamDAO mexamDAO;
    private TermDAO mtermDAO;

    private List<Term> mAllTerms;
    private List<Course> mAllCourses;
    private List<Exam> mAllExams;

    private static int NUMBER_OF_THREADS = 4;

    static final ExecutorService databaseExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public Repository(Application application) {
        SchedulerDatabase db = SchedulerDatabase.getDatabase(application);
        mtermDAO = db.termDAO();
        mcourseDAO = db.courseDAO();
        mexamDAO = db.examDAO();
    }

    public List<Term> getAllTerms() {
        databaseExecutor.execute(() -> {
            mAllTerms = mtermDAO.getAllTerms();
        });
        return mAllTerms;
    }

    public List<Course> getAllCourses() {
        databaseExecutor.execute(() -> {
            mAllCourses = mcourseDAO.getAllCourses();
        });
        return mAllCourses;
    }

        public List<Exam> getAllExams() {
            databaseExecutor.execute(() -> {
                mAllExams = mexamDAO.getAllExams();
            });
            return mAllExams;
        }
}