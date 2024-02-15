module com.example.javacoursework {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.javacoursework to javafx.fxml;
    exports com.example.javacoursework;
}