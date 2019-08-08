package pl.n2god.text_editor.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;

public class textEditorController {

    @FXML
    private VBox mainPane;

    @FXML
    private MenuItem openFile;

    @FXML
    private MenuItem closeFile;

    @FXML
    private Label fileName;

    @FXML
    private TextArea textArea;

    @FXML
    private Button changeToLowerCaseButton;

    @FXML
    private Button toUpperCaseButton;

    @FXML
    private Button clearTextButton;

    public void initialize() {
        //można to zrobić setOnAction
        changeToLowerCaseButton.setOnAction(event -> {
            System.out.print("Wciśnięto przycisk:");
            System.out.println(event.getEventType());
            String originalText = textArea.getText();
            String lowerText = originalText.toLowerCase();
            textArea.setText(lowerText);
        });
        //lub można to zrobić addEventFilter lub addEventHandler - bez różnicy - tylko tutaj można obsługiwać także klawiaturę i mysz
        clearTextButton.addEventFilter(ActionEvent.ACTION, event -> {
            System.out.print("Wciśnięto przycisk: ");
            System.out.println(event.getEventType());
            textArea.setText("");
        });
        //o tu np. obsługujemy klawiaturę
        textArea.addEventFilter(KeyEvent.KEY_TYPED, keyEvent -> {
            System.out.println("Wciśnięto: " + keyEvent.getCharacter());
        });
        //a tu zamykamy proram handlerem bo tak sobie wymyśliłem...
        closeFile.addEventHandler(ActionEvent.ACTION, actionEvent -> {
            System.out.println(actionEvent.getEventType());
            System.out.println("Zakończono program!");
            System.exit(0);
        });


    }

    //definiujemy własną metodę poza initialize - przyjmujący m=parametr ActionEvent lub jaki tam sobie chcemy MouseEvent lub Keyboard czy coś
    public void toUpperCaseAction(ActionEvent actionEvent) {
        System.out.print("Wciśnięto przycisk:");
        System.out.println(actionEvent.getEventType());
        String originalText = textArea.getText();
        String lowerText = originalText.toUpperCase();
        textArea.setText(lowerText);
    }


}