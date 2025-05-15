package com.example.comp1011spring2025thursdays1pm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CameraController {

    @FXML
    private ComboBox<String> cbBrand;

    @FXML
    private ComboBox<String> cbCameraList;

    @FXML
    private ComboBox<String> cbMode;

    @FXML
    private TextField txtColor;

    @FXML
    private TextField txtResolution;

    @FXML
    private TextField txtWeight;

    @FXML
    private TextArea output;

    @FXML
    void submitCameraChoice(ActionEvent event) {

    }

    @FXML
    void submitCameraForm(ActionEvent event) {
        System.out.println(CameraModel.Brands.CANON);
        System.out.println(txtColor.getText());

        output.setText(txtResolution.getText());


    }

}
