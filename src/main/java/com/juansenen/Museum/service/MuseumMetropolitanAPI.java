package com.juansenen.Museum.service;

import com.juansenen.Museum.model.ObjectsId;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MuseumMetropolitanAPI {
    /** Llamada a la API el nº total de objetos */
    @GET("objects")
    Call<ObjectsId> loadAll();

}
