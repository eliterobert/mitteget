package application;

import javafx.scene.control.TextField;

public class Calculator {
	private String result;
	private double results;
	private double num1, num2;

	public Calculator() {
		super();
	}

	String multiply(TextField field1, TextField field2) {
		try {
			num1 = Double.parseDouble(field1.getText());
		} catch (Exception e) {
			num1 = 0;
		}

		try {
			num2 = Double.parseDouble(field2.getText());
		} catch (Exception e) {
			num2 = 0;
		}
		results = num1 * num2;
		result = new Double(results).toString();
		return result;
	}

	String divide(TextField field1, TextField field2) {
		try {
			num1 = Double.parseDouble(field1.getText());
		} catch (Exception e) {
			num1 = 0;
		}

		try {
			num2 = Double.parseDouble(field2.getText());
		} catch (Exception e) {
			num2 = 0;
		}
		results = num1 / num2;
		result = new Double(results).toString();
		return result;
	}

	String add(TextField field1, TextField field2) {
		try {
			num1 = Double.parseDouble(field1.getText());
		} catch (Exception e) {
			num1 = 0;
		}

		try {
			num2 = Double.parseDouble(field2.getText());
		} catch (Exception e) {
			num2 = 0;
		}
		results = num1 + num2;
		result = new Double(results).toString();
		return result;
	}

	String subtract(TextField field1, TextField field2) {
		try {
			num1 = Double.parseDouble(field1.getText());
		} catch (Exception e) {
			num1 = 0;
		}

		try {
			num2 = Double.parseDouble(field2.getText());
		} catch (Exception e) {
			num2 = 0;
		}
		results = num1 - num2;
		result = new Double(results).toString();
		return result;
	}

	public double getResults() {
		return results;
	}

	public double setResults(double results) {
		this.results = results;
		return results;
	}

}
