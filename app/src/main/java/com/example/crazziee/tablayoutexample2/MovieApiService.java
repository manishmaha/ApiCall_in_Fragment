package com.example.crazziee.tablayoutexample2;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Crazziee on 12/5/2017.
 */

public interface MovieApiService {

    @GET("3/movie/popular?api_key=3d9f6ef05faa3072ee2caf7fb6870964&page=1")
    //3/movie/popular?page=1&api_key=3d9f6ef05faa3072ee2caf7fb6870964
    Call<MovieResponse> getNowPlayingMovies(@Query("api_key") String apiKey);
}