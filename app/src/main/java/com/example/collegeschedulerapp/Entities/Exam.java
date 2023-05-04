package com.example.collegeschedulerapp.Entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "examsTable")
public class Exam {
    @PrimaryKey(autoGenerate = true)
    private int examID;
    private String examName;
    private String startDate;
    private String endDate;

    public Exam(int examID, String examName, String startDate, String endDate, String examNotes) {
        this.examID = examID;
        this.examName = examName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.examNotes = examNotes;
    }

    private String examNotes;

    public int getExamID() {
        return examID;
    }

    public void setExamID(int examID) {
        this.examID = examID;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getExamNotes() {
        return examNotes;
    }

    public void setExamNotes(String examNotes) {
        this.examNotes = examNotes;
    }
}
