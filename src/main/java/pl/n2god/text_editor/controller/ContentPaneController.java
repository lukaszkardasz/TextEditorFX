package pl.n2god.text_editor.controller;

/**
 * @author n2god on 09/08/2019
 * @project TextEditor
 */

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class ContentPaneController {

    @FXML
    private TextArea mainTextArea;

    public TextArea getMainTextArea() {
        return mainTextArea;
    }

    public void initialize() {
        System.out.println("ContentPaneController created");
    }

}


