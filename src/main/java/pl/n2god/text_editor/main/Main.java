package pl.n2god.text_editor.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/textEditorPane.fxml"));
        Scene scene = new Scene(mainPane);
        stage.setScene(scene);
        stage.setTitle("Text editor");
        stage.show();

        //kliknięcie myszy
        scene.addEventFilter(MouseEvent.MOUSE_CLICKED, mouseEvent -> System.out.println("Klik!"));
        scene.setOnMouseEntered(mouseEvent -> System.out.println("Najchano kursorem na scenę!"));
        scene.setOnMouseExited(mouseEvent -> System.out.println("Kursor wyszedł ze sceny!"));

        //naciśnięcia klawiszy
        scene.addEventFilter(KeyEvent.KEY_TYPED, keyEvent -> System.out.println("Nacisnięto przycisk: " + keyEvent.getCharacter()));

    }
}
