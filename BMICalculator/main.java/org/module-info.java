module BMICalculatorApp {
    // Requires the javafx base, controls, and fxml modules
    requires javafx.controls;
    requires javafx.fxml;

    // Opens the package containing your FXML and controller to javafx.fxml
    opens your.package.name to javafx.fxml;

    // Exports the package containing your application main class
    exports your.package.name;
}
