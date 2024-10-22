package BMICalculatorApp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class BMICalculatorController {

    public GridPane grid;
    public Button calculateButton;
    @FXML
    private TextField weightField;

    @FXML
    private TextField heightField;

    @FXML
    private Label bmiResultLabel;

    @FXML
    private Label statusResultLabel;

    @FXML
    private void calculateBMI() {
        try {
            double weight = Double.parseDouble(weightField.getText());
            double height = Double.parseDouble(heightField.getText());

            // Calculate BMI
            double bmi = weight / (height * height);

            // Set the BMI result
            bmiResultLabel.setText(String.format("%.2f", bmi));

            // Determine the BMI status
            String status = getBMIStatus(bmi);
            statusResultLabel.setText(status);
        } catch (NumberFormatException ex) {
            bmiResultLabel.setText("Invalid input");
            statusResultLabel.setText("");
        }
    }

    private String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}
