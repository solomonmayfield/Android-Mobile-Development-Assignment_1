package com.example.assignment_1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Assignment_1_Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment_1_);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.assignment_1_, menu);
        return true;
    }
    
}
