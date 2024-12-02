module com.example.textprocessingtool {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.textprocessingtool to javafx.fxml;
    exports com.example.textprocessingtool;
}