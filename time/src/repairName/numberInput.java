package repairName;
import javax.swing.*;

public class numberInput {
    public static void main(String[] args) {
		String inputString;
		int inputNumber;
		int result;
		final int FACTOR = 10;
		
		inputString = JOptionPane.showInputDialog(null,"Enter number");
		inputNumber = Integer.parseInt(inputString);
		result = inputNumber * FACTOR;
		JOptionPane.showMessageDialog(null, inputNumber + " * " + FACTOR + " = " + result);
	}
}
