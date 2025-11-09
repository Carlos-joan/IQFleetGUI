module UI {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens UI to javafx.fxml;
    exports UI;
}
