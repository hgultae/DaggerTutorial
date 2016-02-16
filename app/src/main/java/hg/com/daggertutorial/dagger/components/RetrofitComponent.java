package hg.com.daggertutorial.dagger.components;

import javax.inject.Singleton;

import dagger.Component;
import hg.com.daggertutorial.dagger.modules.RetrofitModule;
import hg.com.daggertutorial.ui.activities.RetrofitTestActivity;

/**
 * Created by Hurman on 16/02/2016.
 */
@Singleton
@Component(modules = RetrofitModule.class)
public interface RetrofitComponent {

    void inject(RetrofitTestActivity retrofitTestActivity);
}
