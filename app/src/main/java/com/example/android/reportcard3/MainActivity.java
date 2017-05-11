package com.example.android.reportcard3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        public static final String LOG_TAG = ReportCard.class.getSimpleName();
        Log.d(LOG_TAG, reportCardString);
    }
}
