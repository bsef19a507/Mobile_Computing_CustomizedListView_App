package com.example.studentsinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyViewAdapter extends ArrayAdapter<Student> {

    public MyViewAdapter(@NonNull Context context, ArrayList<Student> studentArrayList) {
        super(context, 0, studentArrayList);
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Student student = getItem(position);
        convertView = LayoutInflater.from(getContext()).

                inflate(R.layout.student_view, parent, false);
        TextView textViewName = convertView.findViewById(R.id.textViewName);
        TextView textViewCampus = convertView.findViewById(R.id.textViewCampus);
        TextView textViewId = convertView.findViewById(R.id.textViewID);
        ImageView imageView = convertView.findViewById(R.id.imageView);
        textViewName.setText(student.name);
        textViewCampus.setText(student.campus);
        textViewId.setText(student.rollNumber);
        imageView.setImageResource(student.imageID);
        return convertView;
    }
}


