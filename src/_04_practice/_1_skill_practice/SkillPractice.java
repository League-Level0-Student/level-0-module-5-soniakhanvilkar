package _04_practice._1_skill_practice;

import java.util.Iterator;
import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		           skills.skill1();
		           skills.skill2();
		           skills.skill3();
		           skills.skill4();
		           skills.skill5();
		 }

		 void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have

String dime = JOptionPane.showInputDialog("How many dimes do you have?");
int dimes = Integer.parseInt(dime);

		// Tell them how many cents they have (hint multiply by 10)

JOptionPane.showMessageDialog(null, "You have " + dimes * 10 + " cents");

		// Ask the user how tall they are (inches)

String inches = JOptionPane.showInputDialog("How tall are you in inches?");
int height = Integer.parseInt(inches);

		// If they are shorter than 36 inches, tell them to eat their Wheaties

if (height < 36) {
	JOptionPane.showMessageDialog(null, "Eat your wheaties :l");
}

		 }

		 void skill2() {// Write a loop to print every third number between 1 and 30 to the console 

for (int i = 1; i < 31; i++) {
	if (i % 3 == 0) {
		System.out.println(i);
	}
}

		 }

		 void skill3() {// Get a random number that is less than 20 and print it to the console 

			 int randomNumber1 = 0;
			 Random number1 = new Random();
	            for (int i = 0; i< 1; i++){
	              randomNumber1 = number1.nextInt(20);
	              System.out.println("Random No : " + randomNumber1); 
	             }

		// Get another random number that is less than 10 and print it to the console 

	            int randomNumber2 = 0;
	            Random number2 = new Random();
	            for (int i = 0; i< 1; i++){
	             randomNumber2 = number2.nextInt(10);
	              System.out.println("Random No : " + randomNumber2); 
	             }

		// Using a pop-up, tell the user the total of the random numbers 

JOptionPane.showMessageDialog(null, "The total of the random numbers are: " + (randomNumber1 +  randomNumber2));

			}

		 void skill4() {// In a pop-up, ask the user for the city they live in 

String city = JOptionPane.showInputDialog("What city do you live in?");

		// If they answered "San Diego", tell them they live in America's Finest City 

if (city.equalsIgnoreCase("San Diego")) {
	JOptionPane.showMessageDialog(null, "You live in America's finest city =D");
}

		// Otherwise, tell them to move to San Diego 

else {
	JOptionPane.showMessageDialog(null, "Move to San Diego :l");
}

		// Create a variable - cars - and initialize it to the number of cars your family has.// If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 

int cars = 2;

		// If there is 1 car, use a pop-up to display the make/model of the car 

if (cars == 1) {
	JOptionPane.showMessageDialog(null, "Tesla model S");
}

		// If there is more than 1 car, use a pop-up to display how many wheels the// cars have between them. 

if (cars >= 2) {
	JOptionPane.showMessageDialog(null, "number of wheels: " + cars * 4);
}

		 }

		 void skill5() {// In a pop-up, ask the user for the name of their school 

String school = JOptionPane.showInputDialog("What school do you go to?");

		// In another pop-up, tell the user, that their school is a fantastic school.// You must include the name of the school in the message. 

JOptionPane.showMessageDialog(null, school + " is a fantastic school =D");

		 }
		 }


