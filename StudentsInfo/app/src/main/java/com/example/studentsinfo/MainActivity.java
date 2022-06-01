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

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("Ali", "001", "A","SE", 101));
        studentArrayList.add(new Student("Saad", "002", "M", "IT",102));
        studentArrayList.add(new Student("Aila", "003", "A", "CS",103));
        studentArrayList.add(new Student("David", "004", "M","DS", 104));
        MyViewAdapter adapter = new MyViewAdapter(this, studentArrayList);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);



    }
}