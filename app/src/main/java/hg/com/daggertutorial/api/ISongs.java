package hg.com.daggertutorial.api;

import hg.com.daggertutorial.model.Song;
import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Hurman on 16/02/2016.
 */
public interface ISongs {

    @GET("/search?term=classick&amp;media=music&amp;entity=song&amp;limit=50")
    public void getSongs(Callback<Song> response );

}
