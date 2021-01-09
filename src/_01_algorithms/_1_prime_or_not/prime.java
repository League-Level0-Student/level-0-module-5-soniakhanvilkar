package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime {
public static void main(String[] args) {
	String number = JOptionPane.showInputDialog("Enter a number");
	int numbers = Integer.parseInt(number);
	boolean isprime = true;
	for (int i = 2; i < numbers; i++) {
		if (numbers % i == 0) {
			isprime = false;
		}
	}
	if (isprime == false) {
		JOptionPane.showMessageDialog(null, "This number is composite");
	}
	else {
		JOptionPane.showMessageDialog(null, "This number is prime");
	}
}
}
