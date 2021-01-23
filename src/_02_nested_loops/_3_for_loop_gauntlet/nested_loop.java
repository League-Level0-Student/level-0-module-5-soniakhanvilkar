package _02_nested_loops._3_for_loop_gauntlet;

public class nested_loop {
public static void main(String[] args) {
	for (int i = 0; i < 101; i++) {
		System.out.println(i);
	}
	for (int i = 100; i > 0; i--) {
		System.out.println(i);
	}
	for (int i = 0; i < 101; i++) {
		if (i % 2 == 0) {
			System.out.println(i);
		}	
	}
	for (int i = 0; i < 100; i++) {
		if (i % 2 == 1) {
			System.out.println(i);
		}
	}
	for (int i = 0; i < 500; i++) {
		if (i % 2 == 0) {
			System.out.println(i + " even");
		}
		else {
			System.out.println(i + " odd");
		}
	}
	for (int i = 0; i < 78; i++) {
		if (i % 7 == 0) {
			System.out.println(i);
		}
	}
	int year = 2007;
	for (int i = 0; i < 14; i++) {
		 year++;
		 System.out.println("In " + year + " I was " + i + " years old");
	}
	for (int i = 0; i < 3; i++) {
	for (int j = 0; j < 3; j++) {
		System.out.println(i + " " + j);
	}	
	}
	for (int i = 1; i < 10; i += 3) {
	for (int j = i; j < i + 3; j++) {
		System.out.print(j + " ");
	}
		System.out.println();
	}
	for (int i = 1; i < 101; i += 10) {
	for (int j = i; j < i + 10; j++) {
		System.out.print(j + " ");
	}
		System.out.println();
	}
	for (int i = 0; i < 6; i++) {
	for (int j = 0; j <= i ; j++) {
		System.out.print("* ");
	}	
		System.out.println();
	}
}
}
