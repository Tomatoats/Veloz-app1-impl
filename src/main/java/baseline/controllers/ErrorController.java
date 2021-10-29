package baseline.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ErrorController {

    @FXML
    private Label ErrorLabel;

    public void SetError(String prompt){
        ErrorLabel.setText(prompt);
    }

}
