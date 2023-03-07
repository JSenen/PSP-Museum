package com.juansenen.Museum.service;

import com.juansenen.Museum.model.ObjectsByID;
import com.juansenen.Museum.model.ObjectsID;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ObjectsIdAPI {

    @GET("objects")
    Observable<ObjectsID> loadAll();

    @GET("objects/{objectId}")
    Observable<ObjectsByID> loadOneObra(@Path("objectId") int objectId);
}
