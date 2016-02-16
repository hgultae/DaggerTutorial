package hg.com.daggertutorial.dagger.modules;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hg.com.daggertutorial.MyApplication;

/**
 * Created by Hurman on 16/02/2016.
 */
@Module
public class SharedPreferenceModule {

    private final MyApplication myApplication;

    public SharedPreferenceModule(MyApplication application){
        this.myApplication = application;
    }

    @Singleton
    @Provides
    SharedPreferences provideSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(myApplication);
    }

}
