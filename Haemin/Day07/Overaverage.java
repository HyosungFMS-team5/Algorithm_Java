package alonestudy;

import java.util.ArrayList;
import java.util.Scanner;

public class Overaverage {

	public static void main(String[] args) {
		
		int score[] = {7, 100, 95, 90, 80, 70, 60};
		
		int sum = 0; 
	
		for(int i = 1; i < score.length; i++) {
			sum += score[i];
		}
		
		double avg = sum / score[0];
		
		System.out.println(avg);
		
		
	}

}
