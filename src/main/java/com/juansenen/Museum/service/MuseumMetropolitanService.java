package com.juansenen.Museum.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.juansenen.Museum.model.Departments;
import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class MuseumMetropolitanService {

    //Declación URL de la API ofrece los datos
    static final String BASE_URL = "https://collectionapi.metmuseum.org/public/collection/v1/";
    //Creacion objeto api
    private MuseumMetropolitanAPI objectsIdAPI;

    public MuseumMetropolitanService() {
        //Objeto gson para los datos recibidos
        Gson gson = new GsonBuilder().setLenient().create();
        //Creacion objeto retrofit lea los datos de la API
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))         //Conversor a gson
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())      //Adaptador
                .build();

        this.objectsIdAPI = retrofit.create(MuseumMetropolitanAPI.class);
    }
    //Metodo obtiene todas las Id de los objetos
    public Observable<Departments> getAll() throws IOException {
        return this.objectsIdAPI.loadAll();
    }

}
