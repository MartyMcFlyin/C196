package com.example.collegeschedulerapp.Entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "examsTable")
public class Exam {
    @PrimaryKey(autoGenerate = true)
    private int examID;
    private String examName;
    private Date startDate;
    private Date endDate;

    public Exam(int examID, String examName, Date startDate, Date endDate, String examNotes) {
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getExamNotes() {
        return examNotes;
    }

    public void setExamNotes(String examNotes) {
        this.examNotes = examNotes;
    }
}
