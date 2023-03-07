package com.juansenen.Museum;

import com.juansenen.Museum.controller.AppController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void init() throws Exception {
        super.init();
    }
    @Override
    public void start(Stage stage) throws Exception {

        //Cargamos el controlador de la pantalla incial de Splash
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/MuseumScreen.fxml"));
        loader.setController(new AppController());
        AnchorPane anchorPane = loader.load();

        //Dibujamos la pantalla
        Scene scene = new Scene(anchorPane);
        stage.setScene(scene);
        stage.setTitle("Museum");
        stage.show();

    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

    public static void main(String[] args) {
        launch();
    }
}
