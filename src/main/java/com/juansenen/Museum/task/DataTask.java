package com.juansenen.Museum.task;

import com.juansenen.Museum.model.ObjectsByID;
import com.juansenen.Museum.service.ObjectsService;
import javafx.concurrent.Task;

import java.util.List;

public class DataTask extends Task<List<ObjectsByID>> {

    public DataTask() {
    }
    @Override
    protected List<ObjectsByID> call() throws Exception {

        ObjectsService objectsService = new ObjectsService();

        return null;
    }
}
