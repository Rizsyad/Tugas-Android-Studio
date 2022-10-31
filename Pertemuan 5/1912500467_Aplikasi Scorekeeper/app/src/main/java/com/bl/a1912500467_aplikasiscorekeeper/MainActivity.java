package com.bl.a1912500467_aplikasiscorekeeper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int mScore1 = 0;
    int mScore2 = 0;

    TextView mScoreText1;
    TextView mScoreText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreText1 = (TextView) findViewById(R.id.score_1);
        mScoreText2 = (TextView) findViewById(R.id.score_2);
    }

    public void decreaseScore(View view) {
        int viewID = view.getId();
        switch (viewID) {
            // If it was on Team 1 case R.id.decreaseTeam1:
            case R.id.decreaseTeam1:
                mScore1--;
                mScoreText1.setText(String.valueOf(mScore1));
                break;
            case R.id.decreaseTeam2:
                // Decrement the score and update the TextView
                 mScore2--;
                 mScoreText2.setText(String.valueOf(mScore2));
                 break;
            default:
                break;
        }
    }

    public void increaseScore(View view) {
        int viewID = view.getId();
        switch (viewID) {
            // If it was on Team 1 case R.id.decreaseTeam1:
            case R.id.increaseTeam1:
                mScore1++;
                mScoreText1.setText(String.valueOf(mScore1));
                break;
            case R.id.increaseTeam2:
                // Decrement the score and update the TextView
                mScore2++;
                mScoreText2.setText(String.valueOf(mScore2));
                break;
            default:
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        // Change the label of the menu based on the state of the app
        int nightMode = AppCompatDelegate.getDefaultNightMode();
        if(nightMode == AppCompatDelegate.MODE_NIGHT_YES) {
            menu.findItem(R.id.night_mode).setTitle(R.string.day_mode);
        } else {
            menu.findItem(R.id.night_mode).setTitle(R.string.night_mode);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Get the night mode state of the app
        int nightMode = AppCompatDelegate.getDefaultNightMode();
        // Set the theme mode for the restarted activity
        if(nightMode == AppCompatDelegate.MODE_NIGHT_YES) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }

        return true;
    }
}