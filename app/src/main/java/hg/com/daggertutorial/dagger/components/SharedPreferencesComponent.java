package hg.com.daggertutorial.dagger.components;

import javax.inject.Singleton;

import dagger.Component;
import hg.com.daggertutorial.ui.activities.MainActivity;
import hg.com.daggertutorial.ui.activities.ScrollingActivity;
import hg.com.daggertutorial.dagger.modules.SharedPreferenceModule;

/**
 * Created by Hurman on 16/02/2016.
 */
@Singleton
@Component(modules = SharedPreferenceModule.class)
public interface SharedPreferencesComponent {

    void inject(MainActivity mainActivity);
    void inject(ScrollingActivity scrollingActivity);

}
