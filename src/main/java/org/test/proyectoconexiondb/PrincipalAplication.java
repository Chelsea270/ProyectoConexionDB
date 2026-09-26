package org.test.proyectoconexiondb;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrincipalAplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage)  throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(PrincipalAplication.class.getResource("/principal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("nooo!");
        stage.setScene(scene);
        stage.show();

    }
}
