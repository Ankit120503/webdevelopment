package com.example.csd214lab3ankit;

import javafx.collections.FXCollections;
import javafx.scene.control.TableColumn;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.util.ResourceBundle;
import java.sql.*;
public class EmployeeController extends Employee {


    public TableColumn ID;
    public TableColumn Name;
    public TableColumn Salary;

    public EmployeeController(int ID, String Name, String Salary) {

    }
        public TextField eName;
        public TextField eSalary;
        public Label welcomeText;
        public TextField eID;

        @FXML
        private TableView<Employee> tableView;
        @FXML
        private TableColumn<Employee, Integer> ID;
        @FXML
        private TableColumn<Employee, String> Name;
        @FXML
        private TableColumn<Employee, String> Salary;
        @FXML
        ObservableList<Employee> list = FXCollections.observableArrayList();

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
            ID.setCellValueFactory(new
                    PropertyValueFactory<Employee, Integer>("ID"));
            Name.setCellValueFactory(new
                    PropertyValueFactory<Employee, String>("Name"));
            Salary.setCellValueFactory(new
                    PropertyValueFactory<Employee, String>("Salary"));

            tableView.setItems(list);
        }

        @FXML
        protected void EmployeeController.

    void java() {
            populateTable();
        }

        public void populateTable() {
// Establish a database connection
            String jdbcUrl = "jdbc:mysql://localhost:3306/market";
            String dbUser = "root";
            String dbPassword = "";
            try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUser,
                    dbPassword)) {
// Execute a SQL query to retrieve data from the database
                String query = "SELECT * FROM `product`";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                list.clear();
// Populate the table with data from the database
                while (resultSet.next()) {
                    int ID = resultSet.getInt("id");
                    String Name = resultSet.getString("name");
                    String Salary = resultSet.getString("salary");
                    boolean add = tableView.getItems().add(new EmployeeController(ID, Name, Salary));
                }
            } catch (SQLException e) {
                e.printStackTrace();

            }

        }

        public void Insertbutton(ActionEvent actionEvent) {

            String x = eName.getText();
            String y = eSalary.getText();
            Insertbutton(x, y );
        }

        private void Insertbutton(String x, String y ) {
            String jdbcUrl = "jdbc:mysql://localhost:3306/market";
            String dbUser = "root";
            String dbPassword = "";
            try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUser,
                    dbPassword)) {
// Execute a SQL query to retrieve data from the database
                String query = "INSERT INTO `product`( `name`, `salary` ) VALUES ('" + x + "','" + y + "')";
                var statement = connection.createStatement();
                statement.execute(query);
// Populate the table with data from the database

            } catch (SQLException e) {
                e.printStackTrace();

            }

        }

        public void Deletebutton(ActionEvent actionEvent) {


            String EID=eID.getText();

            String jdbcUrl = "jdbc:mysql://localhost:3306/market";
            String dbUser = "root";
            String dbPassword = "";
            try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUser,
                    dbPassword)) {
// Execute a SQL query to retrieve data from the database
                String query = "DELETE FROM `product` WHERE ID='"+EID+"'";
                Statement statement = connection.createStatement();
                statement.execute(query);

            } catch (SQLException e) {
                e.printStackTrace();
            }


        }

        public void Updatebutton(ActionEvent actionEvent) {

            String Eid = eID.getText();
            String Ename = eName.getText();
            String Esalary = eSalary.getText();


            String jdbcUrl = "jdbc:mysql://localhost:3306/market";
            String dbUser = "root";
            String dbPassword = "";
            try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUser,
                    dbPassword)) {
// Execute a SQL query to retrieve data from the database
                String query = "UPDATE `product` SET `name`='" + Ename + "',`salary`='" + Esalary + "' WHERE id='" + Eid + "'";
                Statement statement = connection.createStatement();
                statement.execute(query);

                populateTable();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void Loadbutton(ActionEvent actionEvent) {
            String EID =eID.getText();

            String jdbcUrl = "jdbc:mysql://localhost:3306/market";
            String dbUser = "root";
            String dbPassword = "";

            try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUser,
                    dbPassword)) {
// Execute a SQL query to retrieve data from the database
                String query = "SELECT * FROM `product` WHERE id='"+EID+"'";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
// Populate the table with data from the database
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String salary = resultSet.getString("salary");


                    eName.setText(name);
                    eSalary.setText(salary);

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }



        }

        public void set_Username(String message){
            welcomeText.setText(message);
        }
    }


}
