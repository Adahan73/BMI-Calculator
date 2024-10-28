module org.example.democalc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.democalc to javafx.fxml;
    exports org.example.democalc;
    exports BMICalculatorApp;
    opens BMICalculatorApp to javafx.fxml;
}
