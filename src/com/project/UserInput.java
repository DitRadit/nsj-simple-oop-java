package com.project;

import java.util.Scanner;


public class UserInput extends Entity {
	private Scanner scanner;
	
	
	//SCANNER==========================================
	public UserInput() {
		scanner = new Scanner(System.in);
	}

	
	//INPUT NAME METHOD================================
	public void inputName() {
		System.out.println("");
		System.out.println("======= ENTER YOUR NAME =======");
		while(true) {
			System.out.println("");
			System.out.print("Please enter your name : ");
			String name = scanner.nextLine();
			String regex = "^([A-Z][a-z]*((\\s)))+[A-Z][a-z]*$";
			if (name.matches(regex)) {
				Entity.setName(name);
				break;
			}
			else {
				System.out.println("");
				System.out.println("Your name is invalid. Name input should start with capital letter and have spaces in between first and last name. Please try again.");
				System.out.println("");
				System.out.println("For example : 'Kuku Kaka',  'Dotore Luna'" );
			}
		}
	}
	//INPUT WEIGHT METHOD==============================
	public void inputWeight() {
	    System.out.println("");
	    System.out.println("======= ENTER YOUR CURRENT WEIGHT =======");
	    System.out.println("");
	    Scanner input = new Scanner(System.in);
	    while(true) {
	        System.out.print("Please enter your current weight in (kg) : ");
	        if(input.hasNextInt()) {
	            int weight = input.nextInt();
	            input.nextLine(); 
	            Entity.setWeight(weight); 
	            int getWeight = Entity.getWeight(); 
	            System.out.println("");
	            System.out.println("Your current weight is: " + getWeight + " kg");
	            break;
	        }
	        else {
	        	System.out.println("");
	            System.out.println("Invalid input, please enter a valid weight in (kg) ('60','70','80','90') : ");
	            input.nextLine();
	        }
	    }
	}
	//INPUT TRAINING PLAN METHOD=======================
	public void inputTrainingPlan() {
		System.out.println("");
		System.out.println("================================= TRAINING PLAN =================================");
		System.out.println("");
		while(true) {
			System.out.println("1. Beginner		: 	(2 sessions per week) –weekly fee	: $25.00");
			System.out.println("2. Intermediate		: 	(3 sessions per week) –weekly fee	: $30.00");
			System.out.println("3. Elite		: 	(5 sessions per week) –weekly fee	: $35.00");
			System.out.println("");
			System.out.print("Please choose your Training Plan : ");
			String choice = scanner.nextLine();
			if (choice.equalsIgnoreCase("Beginner")) {
				Entity.setPlan("Beginner");
				Entity.setMonthlyCost(25*4);
				break;
			} else if (choice.equalsIgnoreCase("Intermediate")) {
				Entity.setPlan("Intermediate");
				Entity.setMonthlyCost(30*4);
				break;
			}
			if (choice.equalsIgnoreCase("Elite")) {
				Entity.setPlan("Elite");
				Entity.setMonthlyCost(35*4);
				break;
			}
			System.out.println("Your choice is invalid, please choose and try again.");
			System.out.println("");
			System.out.println("For example : 'Beginner' , 'Elite' , 'Intermediate' ");
			System.out.println("");
			
		}
	}
	//INPUT WEIGHT CATEGORY METHOD=====================
	public void inputWeightCategory() {
	    System.out.println("");
	    System.out.println("============== CHOOSE WEIGHT CATEGORY ==============");
	    System.out.println("");
	    System.out.println("1. Flyweight		: 	(66 kg and below)");
	    System.out.println("2. Lightweight		: 	(73 kg and below)");
	    System.out.println("3. Light-Middleweight	: 	(81 kg and below)");
	    System.out.println("4. Middleweight		: 	(90 kg and below)");
	    System.out.println("5. Light-Heavyweight	: 	(100 kg and below)");
	    System.out.println("6. Heavyweight		: 	(Unlimited)");
	    System.out.println("");
	    System.out.print("Please enter your choice : ");
	    Scanner input = new Scanner(System.in);
	    while(true) {
	        String weightCategory = input.nextLine();
	        if(weightCategory.equalsIgnoreCase("1") || weightCategory.equalsIgnoreCase("Flyweight")) {
	            if(Entity.getWeight() <= 66) {
	            	System.out.println("");
	                System.out.println("You are eligible for the Flyweight category.");
	                System.out.println("");
	                Entity.setWCategory("Flyweight");
	                break;
	            } else if(Entity.getWeight() > 66) {
	            	 System.out.println("");
	            	 System.out.println("You are "+(Entity.getWeight() - 66)+ " kg from the weight category that you have chose. ");
	                 System.out.println("Make sure you reach into specific weight with your training plan that you have choose.");
	                 System.out.println("");
	                 Entity.setWCategory("Flyweight, You are " +(Entity.getWeight() - 66) + " kg from the weight category that you have chosen.\nMake sure you reach into specific weight with your training plan that you have choose. ");
	            	 break;
	            }
	        } 
	        
	        else if (weightCategory.equalsIgnoreCase("2") || weightCategory.equalsIgnoreCase("Lightweight")) {
	        	 if(Entity.getWeight() <= 73 && Entity.getWeight() > 66) {
	        	        System.out.println("");
	        	        System.out.println("You are eligible for the Lightweight category.");
	        	        System.out.println("");
	        	        Entity.setWCategory("Lightweight");
	        	        break;
	        	    } 
	        	 	else {
	        	        if(Entity.getWeight() < 67) {
	        	            System.out.println("");
	        	            System.out.println("You are "+(67 - Entity.getWeight() )+ " kg from the weight category that you have chosen. ");
	        	            System.out.println("Make sure you reach into specific weight with your training plan that you have choose.");
	        	            System.out.println("");
	        	            Entity.setWCategory("Lightweight\nYou are " +(67-Entity.getWeight()) + " kg from the weight category that you have chosen.\nMake sure you reach into specific weight with your training plan that you have choose. ");
	        	            break;
	        	        }
	        	        else if (Entity.getWeight() > 73 ){
	        	            System.out.println("");
	        	            System.out.println("You are "+(Entity.getWeight() - 73)+ " kg from the weight category that you have chosen. ");
	        	            System.out.println("Make sure you reach into specific weight with your training plan that you have choose.");
	        	            System.out.println("");
	        	            Entity.setWCategory("Lightweight\nYou are " +(Entity.getWeight() - 73) + " kg from the weight category that you have chosen.\nMake sure you reach into specific weight with your training plan that you have choose. ");
	        	            break;
	        	        }
	        	    }
	        	}
	        
	        else if(weightCategory.equalsIgnoreCase("3") || weightCategory.equalsIgnoreCase("Ligh-Middletweight")) {
	            if(Entity.getWeight() <= 81 && Entity.getWeight() > 73) {
	            	System.out.println("");
	                System.out.println("You are eligible for the Light-Middleweight category.");
	                System.out.println("");
	                Entity.setWCategory("Light-Middleweight");
	                break;
	            } else {
        	        if(Entity.getWeight() < 74) {
        	            System.out.println("");
        	            System.out.println("You are "+(74 - Entity.getWeight() )+ " kg from the weight category that you have chosen. ");
        	            System.out.println("Make sure you reach into specific weight with your training plan that you have choose.");
        	            System.out.println("");
        	            Entity.setWCategory("Lightweight\nYou are " +(67-Entity.getWeight()) + " kg from the weight category that you have chosen.\nMake sure you reach into specific weight with your training plan that you have choose. ");
        	            break;
        	        }
        	        else if (Entity.getWeight() > 81 ){
        	            System.out.println("");
        	            System.out.println("You are "+(Entity.getWeight() - 81)+ " kg from the weight category that you have chosen. ");
        	            System.out.println("Make sure you reach into specific weight with your training plan that you have choose.");
        	            System.out.println("");
        	            Entity.setWCategory("Lightweight\nYou are " +(Entity.getWeight() - 73) + " kg from the weight category that you have chosen.\nMake sure you reach into specific weight with your training plan that you have choose. ");
        	            break;
        	        }
        	    }
	        } 
	        else if(weightCategory.equalsIgnoreCase("4") || weightCategory.equalsIgnoreCase("Middleweight")) {
	            if(Entity.getWeight() <= 90 && Entity.getWeight() > 81) {
	            	System.out.println("");
	                System.out.println("You are eligible for the Middleweight category.");
	                System.out.println("");
	                Entity.setWCategory("Middleweight");
	                break;
	            } 
	            else {
        	        if(Entity.getWeight() < 82) {
        	            System.out.println("");
        	            System.out.println("You are "+(81 - Entity.getWeight() )+ " kg from the weight category that you have chosen. ");
        	            System.out.println("Make sure you reach into specific weight with your training plan that you have choose.");
        	            System.out.println("");
        	            Entity.setWCategory("Lightweight\nYou are " +(67-Entity.getWeight()) + " kg from the weight category that you have chosen.\nMake sure you reach into specific weight with your training plan that you have choose. ");
        	            break;
        	        }
        	        else if (Entity.getWeight() > 90 ){
        	            System.out.println("");
        	            System.out.println("You are "+(Entity.getWeight() - 90)+ " kg from the weight category that you have chosen. ");
        	            System.out.println("Make sure you reach into specific weight with your training plan that you have choose.");
        	            System.out.println("");
        	            Entity.setWCategory("Lightweight\nYou are " +(Entity.getWeight() - 73) + " kg from the weight category that you have chosen.\nMake sure you reach into specific weight with your training plan that you have choose. ");
        	            break;
        	        }
        	    }
	        } 
	        else if(weightCategory.equalsIgnoreCase("5") || weightCategory.equalsIgnoreCase("Light-Heavyweight")) {
	            if(Entity.getWeight() <= 100 && Entity.getWeight() > 90) {
	            	System.out.println("");
	                System.out.println("You are eligible for the Light-middleweight category.");
	                System.out.println("");
	                Entity.setWCategory("Light-Heavyweight");
	                break;
	            } 
	            else {
        	        if(Entity.getWeight() < 91) {
        	            System.out.println("");
        	            System.out.println("You are "+(91 - Entity.getWeight() )+ " kg from the weight category that you have chosen. ");
        	            System.out.println("Make sure you reach into specific weight with your training plan that you have choose.");
        	            System.out.println("");
        	            Entity.setWCategory("Lightweight\nYou are " +(91 - Entity.getWeight()) + " kg from the weight category that you have chosen.\nMake sure you reach into specific weight with your training plan that you have choose. ");
        	            break;
        	        }
        	        else if (Entity.getWeight() > 100 ){
        	            System.out.println("");
        	            System.out.println("You are "+(Entity.getWeight() - 100)+ " kg from the weight category that you have chosen. ");
        	            System.out.println("Make sure you reach into specific weight with your training plan that you have choose.");
        	            System.out.println("");
        	            Entity.setWCategory("Lightweight\nYou are " +(Entity.getWeight() - 73) + " kg from the weight category that you have chosen.\nMake sure you reach into specific weight with your training plan that you have choose. ");
        	            break;
        	        }
        	    }
	        } 
	        else if(weightCategory.equalsIgnoreCase("6") || weightCategory.equalsIgnoreCase("Heavyweight")) {
	            if(Entity.getWeight() > 100) {
	            	System.out.println("");
	                System.out.println("You are eligible for the Heavyweight category.");
	                System.out.println("");
	                Entity.setWCategory("Heavyweight");
	                break;
	            } 
	            
	            else if (Entity.getWeight() < 100) {
	            	System.out.println("");
	                System.out.println("You are "+(101 - Entity.getWeight())+ " kg from the weight category that you have chosen. ");
	                System.out.println("Make sure you reach into at least specific weight with your training plan that you have choose.");
	                System.out.println("");
	                Entity.setWCategory("Heavyweight, You are " +(101 - Entity.getWeight()) + " kg from the weight category that you have chosen.\nMake sure you reach into at least specific weight with your training plan that you have choose. ");
	                break;
	                
	            }
	        } 
	        else {
	        	System.out.println("Your choice is invalid.");
				System.out.println("");
				System.out.println("For example : 'Flyweight' , 'Light-middleweight' , 'Middleweight' ");
				System.out.println("");
				System.out.print("Please enter your choice : ");
	        }

	    }
	}
	//INPUT COMPETITION METHOD=========================
	public void inputCompetition() {
		System.out.println("");
	    System.out.println("======= ENTER COMPETITION =======");
	    System.out.println("");
		  while (true) {
		        if (Entity.getPlan().equalsIgnoreCase("Intermediate")
		                || Entity.getPlan().equalsIgnoreCase("Elite")) {
		        	System.out.println("");
		        	 System.out.println("Competition entry fee	:	$22.00 ");
		        	 System.out.println("");
		            System.out.print("Do you want to enter the competition? (y/n) : ");
		            char input = scanner.next().charAt(0);
		            while (input != 'y' && input != 'n') {
		            	System.out.println("");
		                System.out.print("Please enter 'y' for yes or 'n' for no :  ");
		                input = scanner.next().charAt(0);
		            }
		            Entity.setJoinCompetition(input == 'y');
		            if (input == 'y') {
		                int numberOfCompetitions = -1;
		                while (numberOfCompetitions <= 0) {
		                	System.out.println("");
		                    System.out.print("Enter the number of competitions you want to enter : ");
		                    numberOfCompetitions = scanner.nextInt();
		                    if (numberOfCompetitions <= 0) {
		                    	System.out.println("");
		                        System.out.print("Enter a positive number of competitions to participate in :");
		                    }
		                    scanner.nextLine();
		                }
		                System.out.println("");
		                System.out.println("You will be participating a competition " + numberOfCompetitions + " times, once in a month every saturday.");
		                System.out.println("");
		                Entity.setNumberOfCompetitions(numberOfCompetitions);
		                Entity.setCompetitionCost(numberOfCompetitions * 22);
		                break;
		            } else if (input == 'n') {
		            	System.out.println("");
		                System.out.println("You will not entering any competitions.");
		                System.out.println("");
		                break;
		            }
		          
		            
		        } else {
		            Entity.setJoinCompetition(false);
		            Entity.setNumberOfCompetitions(0);
		            Entity.setCompetitionCost(0);
		            System.out.println("");
		            System.out.println("You need to select Intermediate or Elite training plan to enter the competitions.");
		            System.out.println("");
		            break;
		        }
		    }
		}
	//INPUT PRIVATECOACH METHOD========================
	public void inputPrivateCoaching() {
		System.out.println("");
		System.out.println("======= PRIVATE COACHING =======");
		System.out.println("");
		System.out.println("Private tuition - per hour 	:	$9.00");
	    System.out.print("Do you want to follow private coaching? (y/n) : ");
        String input = scanner.next();
        while (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n")) {
        	System.out.println("");
            System.out.print("Your input is invalid, please enter 'y' for yes or 'n' for no");
            input = scanner.next();
        }
        boolean followPrivateCoaching = input.equalsIgnoreCase("y");
        Entity.setFollowPrivateCoaching(followPrivateCoaching);
        if (followPrivateCoaching) {
        	System.out.println("");
            System.out.println("Enter the number of hours of private coaching per week:");
            int numberOfHours = scanner.nextInt();
            while (numberOfHours > 5) {
            	System.out.println("");
                System.out.println("You can only follow a maximum of 5 hours of private coaching per week.");
                System.out.println("");
                System.out.print("Enter the number of hours of private coaching per week :");
                numberOfHours = scanner.nextInt();
            }
            Entity.setNumberOfHours(numberOfHours);
            Entity.setPrivateCoachingCost(numberOfHours * 9 * 4);
        } else {
            Entity.setNumberOfHours(0);
            Entity.setPrivateCoachingCost(0);
        }
	}
  
}