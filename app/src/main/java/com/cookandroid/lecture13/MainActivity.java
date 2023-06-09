package com.cookandroid.lecture13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.LinkedHashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    Map<Integer, Class> runMap = new LinkedHashMap<Integer, Class>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        runMap.put(R.id.main_btn_exam01, Exam01.class);
    }

    public void btnChecked(View v){
        try {openIntent(runMap.get(v.getId()));}
        catch (Exception e){
            Toast.makeText(getApplication(), "오류 발생. :" + e.toString(), Toast.LENGTH_LONG).show();}
    }

    public void openIntent(Class openJava){
        Intent intent = new Intent(getApplicationContext(), openJava);
        startActivity(intent);
    }
}