package com.example.studentsinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        studentArrayList.add(new Student("Ali", "Alpha", "1", R.drawable.a1));
        studentArrayList.add(new Student("Saad", "Beta", "2", R.drawable.a2));
        studentArrayList.add(new Student("Aila", "Alpha", "5", R.drawable.a5));
        studentArrayList.add(new Student("Aiman", "Beta", "6", R.drawable.a2));
        MyViewAdapter adapter = new MyViewAdapter(this, studentArrayList);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);



    }
}