package pl.n2god.text_editor.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class textEditorController {

    @FXML
    private TextArea mainTextArea;

    @FXML
    private Button lowerCaseButton;


    public void initialize() {
        System.out.println("text editor controller initialized");
    }
}
