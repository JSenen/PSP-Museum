package com.juansenen.Museum.controller;

import com.juansenen.Museum.model.ObjectsByID;
import com.juansenen.Museum.task.DataTask;
import javafx.collections.FXCollections;
import javafx.concurrent.WorkerStateEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class AppController implements Initializable {

    public TableView<ObjectsByID> dataTable;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        prepareTableView();

    }
    private void prepareTableView() {
        TableColumn<ObjectsByID, String> accessionColum = new TableColumn<>("Numero Adquisición");
        accessionColum.setCellValueFactory(new PropertyValueFactory<>("accessionNumber"));
        TableColumn<ObjectsByID, String> yearColumn = new TableColumn<>("Año adquisición");
        yearColumn.setCellValueFactory(new PropertyValueFactory<>("accessionYear"));
        TableColumn<ObjectsByID, Integer> objectIdColumn = new TableColumn<>("ID");
        objectIdColumn.setCellValueFactory(new PropertyValueFactory<>("objectID"));
        // TODO Add as many columns as you need

        dataTable.getColumns().add(accessionColum);
        dataTable.getColumns().add(yearColumn);
        dataTable.getColumns().add(objectIdColumn);

        dataTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }

    private void loadData() {

    }
}
