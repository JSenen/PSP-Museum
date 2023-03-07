package com.juansenen.Museum.controller;

import com.juansenen.Museum.model.Departments;
import com.juansenen.Museum.service.MuseumMetropolitanService;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.apache.logging.log4j.core.util.JsonUtils;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;

public class AppController implements Initializable {

    public TableView<Departments> dataTable;
    public Label labelTotal;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        prepareTableView();
        setTotal();

    }
    private void prepareTableView() {
        TableColumn<Departments, Integer> totalColum = new TableColumn<>("Total");
        totalColum.setCellValueFactory(new PropertyValueFactory<>("total"));


        dataTable.getColumns().add(totalColum);

        dataTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }

    public void setTotal(){
        MuseumMetropolitanService api = new MuseumMetropolitanService();
        try {
            api.getAll()
                    .flatMap(Observable::fromArray)
                    .doOnComplete(() -> System.out.println("LISTADO DE TODOS"))
                    .doOnError(throwable -> System.out.println(throwable.getMessage()))
                    .subscribeOn(Schedulers.from(Executors.newCachedThreadPool()))
                    .subscribe(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
