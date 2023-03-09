package com.juansenen.Museum.controller;

import com.juansenen.Museum.task.DataTask;
import javafx.concurrent.WorkerStateEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class AppController implements Initializable {

    public Label labelTotal;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setTotal();

    }

    private void setTotal() {

        DataTask dataTask = new DataTask();
        dataTask.addEventHandler(WorkerStateEvent.WORKER_STATE_SUCCEEDED, workerStateEvent -> {

            Integer objectsId = dataTask.getValue();
            labelTotal.setText(String.valueOf(objectsId));
        });
        try {
            new Thread(dataTask).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
