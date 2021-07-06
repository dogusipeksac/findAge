package com.example.findmyage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText editDob;
    TextView textViewShowAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editDob=findViewById(R.id.etDob);
        textViewShowAge=findViewById(R.id.textView);

    }

    public void findAgeClick(View view) {
        int DOB=Integer.valueOf(editDob.getText().toString());
        Calendar calendar=Calendar.getInstance();
        int year=calendar.get(Calendar.YEAR);
        int age=year-DOB;
        textViewShowAge.setText("your age is "+age);
    }
}