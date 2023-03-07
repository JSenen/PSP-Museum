package com.juansenen.Museum.service;

import com.juansenen.Museum.model.Departments;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MuseumMetropolitanAPI {

    @GET("departments")
    Observable<Departments> loadAll();

//    @GET("objects/{objectId}")
//    Observable<ObjectsByID> loadOneObra(@Path("objectId") int objectId);
}
