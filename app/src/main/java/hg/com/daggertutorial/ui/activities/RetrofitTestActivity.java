package hg.com.daggertutorial.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import hg.com.daggertutorial.MyApplication;
import hg.com.daggertutorial.R;
import hg.com.daggertutorial.api.ISongs;
import hg.com.daggertutorial.model.Song;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class RetrofitTestActivity extends AppCompatActivity {

    @Inject
    RestAdapter restAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit_test);

        ((MyApplication) getApplication()).getRetrofitComponent().inject(this);

        // make recyler view adapter and xml

        ISongs iSongs = restAdapter.create(ISongs.class);
        iSongs.getSongs(new Callback<Song>() {
            @Override
            public void success(Song song, Response response) {

                System.out.println("Success!!");

            }

            @Override
            public void failure(RetrofitError error) {

                System.out.println("Failure!!!");
            }
        });

    }



}
