package com.example.collegeschedulerapp.Database;

import android.content.Context;
import android.content.pm.InstallSourceInfo;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.collegeschedulerapp.DAO.CourseDAO;
import com.example.collegeschedulerapp.DAO.ExamDAO;
import com.example.collegeschedulerapp.DAO.TermDAO;
import com.example.collegeschedulerapp.Entities.Course;
import com.example.collegeschedulerapp.Entities.Exam;
import com.example.collegeschedulerapp.Entities.Term;

@Database(entities = {Course.class, Exam.class, Term.class}, version = 1, exportSchema = false)
public abstract class SchedulerDatabase extends RoomDatabase {

    public abstract CourseDAO courseDAO();

    public abstract TermDAO termDAO();

    public abstract ExamDAO examDAO();

    public static volatile SchedulerDatabase INSTANCE;

    static SchedulerDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (SchedulerDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), SchedulerDatabase.class, "schedDB")
                            .fallbackToDestructiveMigration()
                            .allowMainThreadQueries()
                            .build();
                } else
                    return INSTANCE;
            }

        }
        return INSTANCE;
    }

}


