package com.example.studentsinfo;

import android.app.Activity;
import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.List;

public class MyListView extends ArrayAdapter {
    private final Activity context;
    private final String[] student_name;
    private final String[] student_id;
    private final String[] student_section;
    private final String[] student_degree;
    private final Integer[] imgid;

    public MyListView(@NonNull Context context, int resource, Activity context1, String[] student_name, String[] student_id, String[] student_section, String[] student_degree, Integer[] imgid) {
        super(context, resource);
        this.context = context1;
        this.student_name = student_name;
        this.student_id = student_id;
        this.student_section = student_section;
        this.student_degree = student_degree;
        this.imgid = imgid;
    }
    sdfsa
}
