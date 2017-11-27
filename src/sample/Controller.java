package sample;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

import java.awt.*;

public class Controller {

    public TableView<String> tabelka;
    @FXML public TextField tekst;

    public void handleClick(ActionEvent actionEvent) {
        tabelka.getItems().add(tekst.getText());
    }

    public void initialize() {
        for (TableColumn<String,?> column : tabelka.getColumns()) {
            column.setCellValueFactory((new PropertyValueFactory<>(tekst.getText())));
        }
    }
}