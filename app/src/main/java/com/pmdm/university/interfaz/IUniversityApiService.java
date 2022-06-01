package com.pmdm.university.interfaz;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IUniversityApiService {

    @GET("search?country=Spain")
    Call<UniversityFetchResults> getUniversities();
}
