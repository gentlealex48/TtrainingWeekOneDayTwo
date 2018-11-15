package com.kkaty.trainingweekonedaytwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity
{

    private List<String> strings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int returnFromMethod = someMethod(32);
        Log.d("TAG", "onCreate: " + returnFromMethod);
    }

    public int someMethod(int i) {
        System.out.println("Passed int = " + 1);
        return i + 6;
    }


    public void findDuplicates(List<String> strings) {
        this.strings = strings;
        ArrayList<String> results = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            String temp = strings.get(i);
            for (int j = 0; j < strings.size(); j++) {
                if (i != j) {
                    if (temp.equals(strings.get(j))) {
                        results.add(temp);
                    }
                }
            }
        }
        for (String str : results)
        {
            System.out.println(str);
        }


    }

}