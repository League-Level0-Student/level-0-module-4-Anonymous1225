package _01_double._1_change_calculator;


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String snickel = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		int nickel = Integer.parseInt(snickel);
		String sidime = JOptionPane.showInputDialog("How many dimes do you have?");
		int dime = Integer.parseInt(sidime);
		String siquarter = JOptionPane.showInputDialog("How many quarters do you have?");
		int quarter = Integer.parseInt(siquarter);
		int money = quarter*25+dime*10+nickel*5;
		int cents = money%100;
		int dollars = money/100-cents/100;
		if (cents<10) {
			JOptionPane.showMessageDialog(null, dollars+".0"+cents);
		}
		else {
		JOptionPane.showMessageDialog(null, dollars+"."+cents);
		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has.  Hint: Use a double variable 

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
	}
}

