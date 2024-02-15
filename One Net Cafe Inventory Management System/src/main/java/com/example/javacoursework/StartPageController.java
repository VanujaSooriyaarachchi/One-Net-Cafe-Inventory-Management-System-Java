package com.example.javacoursework;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class StartPageController {


    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private ImageView btnClose;


    @FXML
    private void handleClose (MouseEvent event)
    {
        if(event.getSource() == btnClose)
            System.exit(0);
    }


    public void goToPageTwo(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.centerOnScreen();
    }
}
