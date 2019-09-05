package helloworld;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello + world");
		
		System.out.println("what is ur name?");
		Scanner keyboard = new Scanner(System.in);
		String personname = keyboard.nextLine();
		System.out.println("Hello " + personname);
		
		System.out.println("what is your age?");
		int age = keyboard.nextInt();
		int futureage = age + 10;
		System.out.println("Right now your age is " + age);
		System.out.println("and in 10 years you will be : " + futureage);
		
		
	}

}
