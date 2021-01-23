package _03_method_writing._1_obedient_robot;

import java.awt.Color;
import java.awt.geom.Ellipse2D;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedient_robot {
public static void main(String[] args){
	
	rob.penDown();
	rob.miniaturize();
	rob.setSpeed(10);
	rob.setPenWidth(5);
	String [] options = {"red", "green", "blue" , "pink", "black"};
	int color = JOptionPane.showOptionDialog(null, "choose your color", "choose your color", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
			null, options, options [0]);
	if (color == 0) {
		rob.setPenColor(Color.RED);
	}
	if (color == 1) {
		rob.setPenColor(Color.GREEN);
	}
	if (color == 2) {
		rob.setPenColor(Color.BLUE);
	}
	if (color == 3) {
		rob.setPenColor(Color.PINK);
	}
	if (color == 4) {
		rob.setPenColor(Color.BLACK);
	}
	
	String shape = JOptionPane.showInputDialog("What shape would you like to draw?");
	if (shape.equalsIgnoreCase("circle")) {
		drawCircle();
	}
	if (shape.equalsIgnoreCase("square")) {
		drawSquare();
	}
	if (shape.equalsIgnoreCase("triangle")) {
		drawTriangle();
	}
	
	
}
static Robot rob = new Robot();
public static void drawSquare () {
	for (int i = 0; i < 4; i++) {
		rob.move(100);
		rob.turn(90);
	}
}
public static void drawTriangle () {
	for (int i = 0; i < 3; i++) {
		rob.move(100);
		rob.turn(120);
	}
}
public static void drawCircle () {
	for (int i = 0; i < 36; i++) {
		rob.move(10);
		rob.turn(10);
	}
}
}
