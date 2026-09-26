package org.test.proyectoconexiondb.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.*;
import javafx.event.ActionEvent;
public class PrincipalController {

    @FXML
    private Label lblEstado;

    @FXML
    private void probarConexion(ActionEvent event) {
        try {
            lblEstado.setText("Conexión exitosa");
        } catch (Exception e) {
            lblEstado.setText("Error de conexión.");
            e.printStackTrace();
        }
    }
}