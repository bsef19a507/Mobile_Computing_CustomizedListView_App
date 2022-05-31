package com.example.studentsinfo;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class MyViewAdapter extends ArrayAdapter<Student> {

    public MyViewAdapter(@NonNull Context context, ArrayList<Student> studentArrayList) {
        super(context, 0, studentArrayList);
    }
}


