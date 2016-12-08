package com.example.alex.mapsproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Alex on 12/4/2016.
 */
public class FindBook extends Activity{
    private EditText titleET;
    private EditText authorET;
    private EditText genreET;
    String titleStr;
    String authorStr;
    String genreStr;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_book);
        titleStr=""; authorStr=""; genreStr="";

        titleET = (EditText)findViewById(R.id.ftitleET);
        authorET = (EditText)findViewById(R.id.fauthorET);
        genreET = (EditText)findViewById(R.id.fgenreET);

        titleET.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                titleStr=titleET.getText().toString();
            }
        });
        authorET.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                authorStr=authorET.getText().toString();
            }
        });
        genreET.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                genreStr=genreET.getText().toString();
            }
        });
    }

    public void findBooks(View view) {
        titleStr = titleET.getText().toString();
        authorStr = authorET.getText().toString();
        genreStr = genreET.getText().toString();
        Toast.makeText(this, "PRESSED BTN" , Toast.LENGTH_SHORT).show();

    }

    public void activateMain(View view) {
        finish();
    }
}