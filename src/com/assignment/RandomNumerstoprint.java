package com.assignment;
import java.util.Random;

public class RandomNumerstoprint {

	public static void main(String[] args) {
		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			int randomNumber = random.nextInt();
			System.out.println(randomNumber);
		}
	}

}
