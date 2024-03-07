package com.example.csd214lab3ankit;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Dashboard {
    public Button Logout;
    public Button Employee;
    public Button Adminn;

    public void Exitbutton(ActionEvent actionEvent) {

        System.exit(0);

    }

    public void Logoutbutton(ActionEvent actionEvent) {
        try {
            // Load the FXML file for the second scene
            Parent secondScene = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

            // Create a new stage for the second scene
            Stage secondStage = new Stage();
            secondStage.setTitle("Lg");
            secondStage.setScene(new Scene(secondScene));

            Stage firstSceneStage = (Stage) Logout.getScene().getWindow();
            firstSceneStage.close();


            // Show the second stage
            secondStage.show();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public void Employeebutton(ActionEvent actionEvent) {

        try {
            // Load the FXML file for the second scene
            Parent secondScene = FXMLLoader.load(getClass().getResource("employee-view.fxml"));

            // Create a new stage for the second scene
            Stage secondStage = new Stage();
            secondStage.setTitle("employee");
            secondStage.setScene(new Scene(secondScene));

            Stage firstSceneStage = (Stage) Employee.getScene().getWindow();
            firstSceneStage.close();


            // Show the second stage
            secondStage.show();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public void Adminbutton(ActionEvent actionEvent) {
        try {
            // Load the FXML file for the second scene
            Parent secondScene = FXMLLoader.load(getClass().getResource("Admin-view.fxml"));

            // Create a new stage for the second scene
            Stage secondStage = new Stage();
            secondStage.setTitle("Admin");
            secondStage.setScene(new Scene(secondScene));

            Stage firstSceneStage = (Stage) Adminn.getScene().getWindow();
            firstSceneStage.close();


            // Show the second stage
            secondStage.show();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }


}



