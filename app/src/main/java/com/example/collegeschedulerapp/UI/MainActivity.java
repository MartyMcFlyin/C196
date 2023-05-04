package com.example.collegeschedulerapp.UI;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.collegeschedulerapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tbutton = findViewById(R.id.termBtn);
        tbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                Intent intent = new Intent(MainActivity.this, TermList.class);
                startActivity(intent);
            }
        });

        Button cbutton = findViewById(R.id.courseBtn);
        cbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                Intent intent = new Intent(MainActivity.this, CourseList.class);
                startActivity(intent);
            }
        });

        Button ebutton = findViewById(R.id.examBtn);
        ebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                Intent intent = new Intent(MainActivity.this, ExamList.class);
                startActivity(intent);
            }


        });

    }

    //Final }
}