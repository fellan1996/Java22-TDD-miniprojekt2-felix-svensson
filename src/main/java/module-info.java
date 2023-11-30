module com.example.primenumberstesting {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.primenumberstesting to javafx.fxml;
    exports com.example.primenumberstesting;
}