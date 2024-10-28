package org.example.democalc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.awt.event.MouseEvent;

public class HelloController {

    @FXML
    private TextField bmiOutput;

    @FXML
    private Button calculateButton;

    @FXML
    private Button clear;

    @FXML
    private GridPane grid;

    @FXML
    private TextField heightinput;

    @FXML
    private TextField statusOutput;

    @FXML
    private RadioButton unitSwitcher;

    @FXML
    private TextField weightinput;

    @FXML
    void calculate(ActionEvent event){
        try
        {
            Double weightValue = Double.parseDouble(weightinput.getText());
            Double heightValue = Double.parseDouble(heightinput.getText());
            Double bmiValue;
            {
                if (!unitSwitcher.isSelected()) {
                    bmiValue = weightValue / (heightValue * heightValue);
                }
                else {
                    bmiValue = 703*weightValue / (heightValue*heightValue);

                }
            }

            weightinput.clear();
            heightinput.clear();
            setResult(bmiValue);

        }
        catch (Exception e)
        {

        }
    }
    void setResult(double bmiValue)
    {
        bmiOutput.setText(String.valueOf(bmiValue));
        if(bmiValue <= 18.5)
        {
            statusOutput.setText("Underweight");
        }
        else if(18.6<= bmiValue && bmiValue <= 24.9)
        {
            statusOutput.setText("Normal");
        }
        else if(25 <= bmiValue && bmiValue <= 29.9)
        {
            statusOutput.setText("Overweight");
        }
        else {
            statusOutput.setText("Obese");
        }
    }
    @FXML
    void clear(MouseEvent event)
    {
        bmiOutput.clear();
        heightinput.clear();
        weightinput.clear();
        statusOutput.clear();
    }
    public void clear(javafx.scene.input.MouseEvent mouseEvent) {
        bmiOutput.clear();
        heightinput.clear();
        weightinput.clear();
        statusOutput.clear();
    }

}

