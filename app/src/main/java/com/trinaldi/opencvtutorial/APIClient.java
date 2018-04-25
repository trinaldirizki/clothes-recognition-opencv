package com.trinaldi.opencvtutorial;

import com.trinaldi.opencvtutorial.model.ClothesRepo;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;

/**
 * Created by mobiltrakya on 25/04/2018.
 */

public interface APIClient {
    @GET("/users/{user}/repos")
    Call<List<ClothesRepo>> reposForUser(@Path("user") String user);

    @Multipart
    @POST("upload")
    Call<ResponseBody> uploadPhoto(
            @Part("description") RequestBody description,
            @Part MultipartBody.Part image
    );
}
