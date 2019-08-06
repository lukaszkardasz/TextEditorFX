module TextEditor {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports pl.n2god.text_editor.main;
    opens pl.n2god.text_editor.controller to javafx.fxml;
}