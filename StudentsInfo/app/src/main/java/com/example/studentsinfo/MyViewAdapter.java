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
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.student_view, parent, false);
        }

        TextView textViewName = convertView.findViewById(R.id.studentName);
        TextView textViewID = convertView.findViewById(R.id.studentID);
        TextView textViewSection = convertView.findViewById(R.id.studentSection);
        TextView textViewDegree = convertView.findViewById(R.id.studentDegree);
        ImageView imageView = convertView.findViewById(R.id.imageView);

        textViewName.setText(student.getName());
        textViewID.setText(student.getStudentId());
        textViewSection.setText(student.getSection());
        textViewDegree.setText(student.getDegree());
        imageView.setImageResource(student.getImageID());

        return convertView;
    }
}


