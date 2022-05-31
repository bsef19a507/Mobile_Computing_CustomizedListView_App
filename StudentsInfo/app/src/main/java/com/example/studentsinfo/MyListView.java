package com.example.studentsinfo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListView extends ArrayAdapter {
    private final Activity context;
    private final String[] student_name;
    private final String[] student_id;
    private final String[] student_section;
    private final String[] student_degree;
    private final Integer[] imgid;

    public MyListView(Activity context, String[] student_name,String[] student_id,String[] student_degree,String[] student_section, Integer[] imgid) {
        super(context, R.layout.activity_main, student_name);
        this.context = context;
        this.student_name = student_name;
        this.student_id = student_id;
        this.student_section = student_section;
        this.student_degree = student_degree;
        this.imgid = imgid;
    }


    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View singleEntityView=inflater.inflate( R.layout.activity_main, null,false);
        TextView name =  singleEntityView.findViewById (R.id.studentName);
        ImageView image =  singleEntityView.findViewById (R.id.imageView);
        TextView sID = singleEntityView.findViewById (R.id.studentID);
        TextView section = singleEntityView.findViewById (R.id.studentSection);
        TextView degree = singleEntityView.findViewById (R.id.studentDegree);


        name.setText(student_name[position]);
        sID.setText(student_id[position]);
        section.setText(student_section[position]);
        degree.setText(student_degree[position]);
        image.setImageResource(imgid[position]);

        return singleEntityView;
    }

}
