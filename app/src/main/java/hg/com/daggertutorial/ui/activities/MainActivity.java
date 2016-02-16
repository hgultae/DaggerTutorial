package hg.com.daggertutorial.ui.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import hg.com.daggertutorial.MyApplication;
import hg.com.daggertutorial.R;

public class MainActivity extends AppCompatActivity {

    // Step 3: Inject our SharedPreferences object
    @Inject
    SharedPreferences preferences;

    @Bind(R.id.textView)
    public TextView textView;

    @Bind(R.id.button1)
    public Button button;

    @OnClick(R.id.button1)
    public void goToNext(View view){
        Toast.makeText(MainActivity.this, "Hiii", Toast.LENGTH_SHORT).show();

        // put into preferencs
        preferences.edit().putString("input", "This is a test").apply();
        startActivity(new Intent(this, RetrofitTestActivity.class));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApplication) getApplication()).getSharedPreferencesComponent().inject(this);
        ButterKnife.bind(this);

        textView.setText("Dagger Tutorial!");

    }



}
