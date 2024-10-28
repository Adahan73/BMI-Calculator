# BMI-Calculator
This project is a Body Mass Index (BMI) Calculator built using JavaFX. The calculator allows users to input their height and weight, calculates their BMI, and displays their BMI status. It supports both metric and imperial units with a unit switcher.

Main Features:
Graphical User Interface (GUI):

Input fields for height and weight.
A unit switcher (implemented with a RadioButton) to toggle between metric units (kg/m) and imperial units (lb/in).
A calculate button that computes the BMI.
Output fields for the BMI value and the corresponding BMI status (e.g., "Normal", "Underweight").
A clear function to reset all input and output fields.
A close button to exit the application.
Controller (HelloController):

The HelloController class handles user input and coordinates actions like BMI calculation, clearing fields, and closing the application.
BMI Calculation:
When the user clicks "Calculate," the calculate() method reads the height and weight input, and based on the unit selection, calculates the BMI.
For metric units, the formula is: BMI = weight / (height * height).
For imperial units, the formula is: BMI = 703 * weight / (height * height).
The result is then displayed in the BMI output field along with the status (Underweight, Normal, Overweight, or Obese), depending on the BMI value.
Logic for BMI Status:

BMI VALUES
Underweight:	less than 18.5
Normal:	between 18.5 and 24.9
Overweight:	between 25 and 29.9
Obese:	30 or greater

ActionEvent: For the calculate button, which triggers the BMI computation.
MouseEvent: For the clear and close buttons, which reset inputs or close the application.
Technologies Used:
Java: Core language for logic and handling events.
JavaFX: Used to build the graphical user interface (GUI).
FXML: (If used) For designing the UI layout and binding to the controller methods.
