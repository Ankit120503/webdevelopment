module com.example.csd214lab3ankit {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.csd214lab3ankit to javafx.fxml;
    exports com.example.csd214lab3ankit;
}