package com.example.ilya.githubapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ilya on 3/28/17.
 */

public class RepoFactory {

    private final static Retrofit REPO_INSTANCE = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    static Retrofit retrofitRepo(){
        return REPO_INSTANCE;
    }

}
