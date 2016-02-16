package hg.com.daggertutorial;

import android.app.Application;

import hg.com.daggertutorial.dagger.components.DaggerRetrofitComponent;
import hg.com.daggertutorial.dagger.components.DaggerSharedPreferencesComponent;
import hg.com.daggertutorial.dagger.components.RetrofitComponent;
import hg.com.daggertutorial.dagger.components.SharedPreferencesComponent;
import hg.com.daggertutorial.dagger.modules.RetrofitModule;
import hg.com.daggertutorial.dagger.modules.SharedPreferenceModule;

/**
 * Created by Hurman on 16/02/2016.
 */
public class MyApplication extends Application{

    SharedPreferencesComponent sharedPreferencesComponent;
    private RetrofitComponent retrofitComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        sharedPreferencesComponent = DaggerSharedPreferencesComponent
                .builder()
                .sharedPreferenceModule(new SharedPreferenceModule(this))
                .build();

        retrofitComponent = DaggerRetrofitComponent
                .builder()
                .retrofitModule(new RetrofitModule(this))
                .build();
    }

    public SharedPreferencesComponent getSharedPreferencesComponent() {
        return sharedPreferencesComponent;
    }

    public RetrofitComponent getRetrofitComponent() {
        return retrofitComponent;
    }
}
