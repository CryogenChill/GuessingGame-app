package com.techlab.game;
import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int tries = 1;
	    boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Guess the number!");
		Random rand = new Random();
		int rand_number = rand.nextInt(10);
		while (flag) {
        	System.out.println("Make a guess:");

        	int Guess = sc.nextInt();
			if (rand_number == Guess) {
				System.out.println("Your guess is CORRECT. try count: "+ tries);
				System.out.println("If you want to Continue -> enter y. anything else to exit");
				char c = sc.next().charAt(0);
				if (c == 'y') {
					tries = 1;
					rand_number = rand.nextInt(10);
					continue;
				}
				else {
					flag = false;
					break;
				}
			}
			else {
				if(Guess > rand_number) {
					System.out.println("Too High !");
					tries++;
				}
				else {
					System.out.println("Too Low !");
					tries++;
				}
			}
        }
	}
}
