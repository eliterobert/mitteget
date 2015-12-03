package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController implements Initializable {

	Calculator calc = new Calculator();
	@FXML
	Button multiply, divided, addition, subtract, clear;
	@FXML
	Label resultLabel;
	@FXML
	TextField numField1, numField2;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		clear.setOnAction(event -> {
			numField1.clear();
			numField2.clear();
			resultLabel.setText("Results");
		});
		try{
		multiply.setOnAction(event -> {
			resultLabel.setText(numField1.getText() + " * " + numField2.getText() + " = " + calc.multiply(numField1, numField2));
		});
		}
		catch (Exception e) {
			resultLabel.setText("Only numbers works!");
		}
		
		
		divided.setOnAction(event -> {
			resultLabel.setText(numField1.getText() + " / " +numField2.getText() + " = " + calc.divide(numField1, numField2));
		});
		
		addition.setOnAction(event -> {
			resultLabel.setText(numField1.getText() + " + " +numField2.getText() + " = " + calc.add(numField1, numField2));
		});
		
		subtract.setOnAction(event -> {
			resultLabel.setText(numField1.getText() + " - " +numField2.getText() + " = " + calc.subtract(numField1, numField2));
		});
		
	}

}
