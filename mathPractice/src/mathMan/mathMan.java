package mathMan;

import java.util.Scanner;

public class mathMan {
	public static void main(String[] args){
		String[] constructor = new String[4];
		constructor [0] = "-";
		constructor [1] = "+";
		constructor [2] = "x";
		constructor [3] = "/";
		int x, y ,z, correct, correct2, result, answer;
		double points;
		float result2, answer2;
		answer2 = 0;
		answer = 0;		
		correct = 0;
		correct2 = 0;
		points = 0;
		
		Scanner scanner = new Scanner ( System.in);
		
		
		for ( int i = 0; i < 10; i++){
			x = randomWithRange(0,3);
			y = randomWithRange(20,50);
			z = randomWithRange(1,10);
			System.out.println("Solve this problem: " + y + " " + constructor[x] + " " + z + " = ?");
			if (x == 0){
				//System.out.println("it is a minus problem");
				result = y-z;
				answer = scanner.nextInt();
				
				if (answer == result){
					System.out.println("You got it right!");
					System.out.println("The answer is " + result);
					points = points + 1;
					correct = correct + 1;
				} 
				else if (answer != result){
					System.out.println("you got it wrong! But try again!");
					answer = scanner.nextInt();
					if (answer == result){
						System.out.println("You got it right this time!");
						System.out.println("The answer is " + result);
						points = points + 0.5;
						correct2 = correct2 + 1;
					} else {
						System.out.println("sorry that was incorrect, the answer was " + result);
					}
				}
			}
			else if (x == 1){
				//System.out.println("it is an addition problem");
				result = y+z;
				answer = scanner.nextInt();
				
				if (answer == result){
					System.out.println("You got it right!");
					System.out.println("The answer is " + result);
					points = points + 1;
					correct = correct + 1;
				} 
				else if (answer != result){
					System.out.println("you got it wrong! But try again!");
					answer = scanner.nextInt();
					if (answer == result){
						System.out.println("You got it right this time!");
						System.out.println("The answer is " + result);
						points = points + 0.5;
						correct2 = correct2 + 1;
					} else {
						System.out.println("sorry that was incorrect, the answer was " + result);
					}
				}
			}
			else if (x == 2){
				//System.out.println("it is a multiplication problem");
				result = y*z;
				answer = scanner.nextInt();
				
				if (answer == result){
					System.out.println("You got it right!");
					System.out.println("The answer is " + result);
					points = points + 1;
					correct = correct + 1;
				} 
				else if (answer != result){
					System.out.println("you got it wrong! But try again!");
					answer = scanner.nextInt();
					if (answer == result){
						System.out.println("You got it right this time!");
						System.out.println("The answer is " + result);
						points = points + 0.5;
						correct2 = correct2 + 1;
					} else {
						System.out.println("sorry that was incorrect, the answer was " + result);
					}
				}
				
			}
			else if (x == 3){
				//System.out.println("it is a division problem");
				result2 = (float) y/z;
				answer2 = scanner.nextFloat();
				
				if (answer2 == result2){
					System.out.println("You got it right!");
					System.out.println("The answer is " + result2);
					points = points + 1;
					correct = correct + 1;
				}
					else if (answer2 != result2){
						System.out.println("you got it wrong! But try again!");
						answer2 = scanner.nextFloat();
						if (answer2 == result2 ){
							System.out.println("You got it right this time!");
							System.out.println("The answer is " + result2);
							points = points + 0.5;
							correct2 = correct2 + 1;
						} else {
							System.out.println("sorry that was incorrect, the answer was " + result2);
						}
					}
			}
		}
		System.out.println("Congrats! you made " + points + " points!! ");
		System.out.println("you had " + correct + " correct on the first attempt!");
		System.out.println("And you made " + correct2 + " correct on the second attempt!");
		
			
			scanner.close();
	
		
	}
	public static int randomWithRange(int min, int max){
		int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
	}

		
	}
	
	
	
	
	
