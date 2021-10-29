package baseline.controllers;

import baseline.functions.Verify;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class itemController {
        Verify verifier = new Verify();
        @FXML
        private Button submit;

        @FXML
        private TextField DescriptionText;

        @FXML
        private TextArea DueDateText;
    @FXML
    private Label ErrorLabel;


    @FXML
        void SubmitPressed(ActionEvent event) {
         if (verifier.DueDateRegex(DueDateText.getText()) &&  verifier.DescriptionLength(DescriptionText.getText()) == true)
         {
             // add it to List and open up List.fxml
         }
         else
         {
             ErrorLabel.setText("You have at least one error. Fix and try again.");
         }
        }
    }