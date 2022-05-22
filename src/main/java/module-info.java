module com.example.sefproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sefproject to javafx.fxml;
    exports com.example.sefproject;
}