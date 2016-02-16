package hg.com.daggertutorial.dagger.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hg.com.daggertutorial.MyApplication;
import hg.com.daggertutorial.utils.Constants;
import retrofit.RestAdapter;

/**
 * Created by Hurman on 16/02/2016.
 */
@Module
public class RetrofitModule {

    private final MyApplication myApplication;

    public RetrofitModule(MyApplication application){
        this.myApplication = application;
    }

    @Singleton
    @Provides
    RestAdapter providesRestAdapter() {

        return new RestAdapter.Builder()
                .setEndpoint(Constants.BASE_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();
    }

}
