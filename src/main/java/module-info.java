module com.example.snackladder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.snakeladder to javafx.fxml;
    exports com.example.snakeladder;
}