package com.example.collegeschedulerapp.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;

import com.example.collegeschedulerapp.Database.Repository;
import com.example.collegeschedulerapp.Entities.Term;
import com.example.collegeschedulerapp.R;

import java.util.List;

public class TermList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_term_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        RecyclerView recyclerView=findViewById(R.id.termRecView);
        Repository repo=new Repository(getApplication());
        List<Term> terms=repo.getAllTerms();
        final TermAdapter adapter=new TermAdapter(this);
        adapter.setTerms(terms);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public boolean onOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_a, menu);
        return true;
    }

    public boolean onOptionsSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.addMenuOp:
                Button tbutton = findViewById(R.id.termBtn);
                tbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v1) {
                        Intent intent = new Intent(TermList.this, TermDetails.class);
                        startActivity(intent);
                    }

                });
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}