package mn.devfest.api;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.OkHttpClient;

import org.joda.time.DateTime;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import mn.devfest.api.adapter.ConferenceTypeAdapter;
import mn.devfest.api.adapter.DateTimeTypeAdapter;
import mn.devfest.api.model.Conference;
import retrofit.RestAdapter;
import retrofit.client.Client;
import retrofit.client.OkClient;

/**
 * Common Dagger module for providing DevFest API dependencies
 *
 * Requires a build-type specific module that provides the RestAdapters
 *
 * @author bherbst
 */
@Module
public class ApiModule {

    @Provides
    @Singleton
    Client provideClient(OkHttpClient client) {
        return new OkClient(client);
    }

    @Provides
    @Singleton
    Gson provideGson() {
        return new GsonBuilder()
                .registerTypeAdapter(Conference.class, new ConferenceTypeAdapter())
                .registerTypeAdapter(DateTime.class, new DateTimeTypeAdapter())
                .create();
    }

    @Provides
    @Singleton
    DevFestApi provideConferenceApi(@Named("conference") RestAdapter restAdapter) {
        return restAdapter.create(DevFestApi.class);
    }

    @Provides
    @Singleton
    FeedbackApi provideFeedbackApi(@Named("feedback") RestAdapter restAdapter) {
        return restAdapter.create(FeedbackApi.class);
    }
}
