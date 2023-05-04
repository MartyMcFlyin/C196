package com.example.collegeschedulerapp.DAO;

import static androidx.room.OnConflictStrategy.IGNORE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.collegeschedulerapp.Entities.Exam;

import java.util.List;

@Dao
public interface ExamDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertExam(Exam exam);
    @Update(onConflict = IGNORE)
    void updateExam(Exam exam);

    @Delete()
    void deleteExam(Exam exam);

    @Query("SELECT * FROM examsTable ORDER BY examID ASC")
    List<Exam> getAllExams();
}
