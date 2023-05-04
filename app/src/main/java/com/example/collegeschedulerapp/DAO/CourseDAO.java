package com.example.collegeschedulerapp.DAO;

import static androidx.room.OnConflictStrategy.IGNORE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.collegeschedulerapp.Entities.Course;
import java.util.List;

@Dao
public interface CourseDAO {
    @Insert(onConflict = IGNORE)
    void insertCourse(Course course);

    @Update(onConflict = IGNORE)
    void updateCourse(Course course);


    @Delete()
    void deleteCourse(Course course);

    @Query("SELECT * FROM coursesTable ORDER BY courseID ASC")
    List<Course> getAllCourses();
}
