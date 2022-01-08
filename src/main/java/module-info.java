module com.example.calculatorapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.calculatorapp to javafx.fxml;
    exports com.calculatorapp;
}