/*
Lesson 1.5: Characters
Author: Stephen Li
Date Created: February 18, 2026
Date Last Modified: February 18, 2026
*/
import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		char a = 'a';
		System.out.println(a);
	}

	public static void q2() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = input.nextLine();
		char a = word.charAt(2);
		System.out.println(a);
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = input.nextLine();
		char a = word.charAt(1);
		System.out.println("The second character user entered was: " + a);
	}

	public static void q4() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		int num = input.nextInt();
		System.out.println("Your number plus 1 is: " + (num + 1));
	}

	public static void q5() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a letter: ");
		String word1 = input.nextLine();
		char a = word1.charAt(0);
		System.out.print("Input another letter: ");
		String word2 = input.nextLine();
		char b = word2.charAt(0);
		System.out.println(a + b);
	}

}
