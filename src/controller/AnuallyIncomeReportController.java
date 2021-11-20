package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AnuallyIncomeReportController {

    public AnchorPane anuallyIncomeReportContext;

    public void previouswindow(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("../viwe/IncomeReportForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) anuallyIncomeReportContext.getScene().getWindow();
        window.setTitle("Income Reports");
        window.setScene(new Scene(load));
    }

    public void adminHomePage(ActionEvent event) throws IOException {
        URL resource = getClass().getResource("../viwe/AdminBordForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) anuallyIncomeReportContext.getScene().getWindow();
        window.setTitle("Income Reports");
        window.setScene(new Scene(load));
    }
}
