package hg.com.daggertutorial.ui.activities;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import javax.inject.Inject;

import hg.com.daggertutorial.MyApplication;
import hg.com.daggertutorial.R;

public class ScrollingActivity extends AppCompatActivity {

    // Step 3: Inject our SharedPreferences object
    @Inject
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        ((MyApplication) getApplication()).getSharedPreferencesComponent().inject(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final String preferencesString = preferences.getString("input", "Default Val...");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, preferencesString, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
