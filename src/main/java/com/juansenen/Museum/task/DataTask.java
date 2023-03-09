package com.juansenen.Museum.task;

import com.juansenen.Museum.model.ObjectsId;
import com.juansenen.Museum.service.MuseumMetropolitanService;
import javafx.concurrent.Task;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

public class DataTask extends Task<Integer> {
    public Integer totalObjects;
    public DataTask() {
    }
    @Override
    protected Integer call() throws Exception {

        MuseumMetropolitanService api = new MuseumMetropolitanService();

        Call<ObjectsId> allObjects = api.getAll();

        try {
            System.out.println("calling API");
            Response<ObjectsId> response = allObjects.execute();
            System.out.println(response.body().toString());
            totalObjects = response.body().getTotal();


        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return totalObjects;
    }
}
