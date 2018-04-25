package com.trinaldi.opencvtutorial;

import com.trinaldi.opencvtutorial.model.ClothesRepo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by mobiltrakya on 25/04/2018.
 */

public interface APIClient {
    @GET("/users/{user}/repos")
    Call<List<ClothesRepo>> reposForUser(@Path("user") String user);
}
