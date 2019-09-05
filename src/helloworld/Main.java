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
		
	}

}
