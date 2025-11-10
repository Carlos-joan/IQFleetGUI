module UI {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires com.jfoenix;

    opens UI to javafx.fxml, com.jfoenix;
    exports UI;
}
