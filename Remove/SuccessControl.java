package sample.Remove;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class SuccessControl {
    @FXML
    public Button back;
    public void setBack(ActionEvent event) throws IOException {
        back.getScene().getWindow().hide();

    }
}
