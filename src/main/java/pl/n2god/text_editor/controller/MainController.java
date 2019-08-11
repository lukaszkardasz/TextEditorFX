package pl.n2god.text_editor.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 * @author n2god on 09/08/2019
 * @project TextEditor
 */

public class MainController {
    @FXML
    private ContentPaneController contentPaneController;

    @FXML
    private ControlPaneController controlPaneController;

    public void initialize(){
        Button lowercaseButton = controlPaneController.getChangeToLowerCaseButton();
        Button upperCaseButton = controlPaneController.getToUpperCaseButton();
        Button clearButton = controlPaneController.getClearTextButton();
        TextArea textArea = contentPaneController.getMainTextArea();

        lowercaseButton.setOnAction(x -> textArea.setText(textArea.getText().toLowerCase()));
        upperCaseButton.setOnAction(x -> textArea.setText(textArea.getText().toUpperCase()));
        clearButton.setOnAction(x -> textArea.clear());
    }
}

