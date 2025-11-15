module com.mycompany.iqfleetgui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires com.jfoenix;

    opens com.mycompany.iqfleetgui to javafx.fxml, com.jfoenix;
    exports com.mycompany.iqfleetgui;
}
