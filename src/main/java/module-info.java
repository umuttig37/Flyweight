module com.example.flyweight {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.flyweight to javafx.fxml;
    exports com.example.flyweight;
}