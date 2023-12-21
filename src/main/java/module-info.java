module com.example.lv7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lv7 to javafx.fxml;
    exports com.example.lv7;
}