package com.project;

import java.text.NumberFormat;
import java.util.*;

public class NSJCalculator {

	public static void main(String[] args) {
				//CALLING ALL METHOD FROM USERINPUT CLASS
		        UserInput userInput = new UserInput();
		        System.out.println("=============== WELCOME TO NSJ ================");
		        System.out.println("");
		        userInput.inputName();
		        userInput.inputWeight();
		        userInput.inputTrainingPlan();
		        userInput.inputWeightCategory();
		        userInput.inputCompetition();
		        userInput.inputPrivateCoaching();
		        CalculatePrice calculatePrice = new CalculatePrice();
		       
		        double totalCost = calculatePrice.calculateTotalCost();
		        
		        //USING NUMBERFORMAT FUNCTION TO CONVERT TO DOUBLE
		        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);

		       
		        String totalCostFormatted = formatter.format(totalCost);
		        
		        String monthlyCostFormatted = formatter.format(Entity.getMonthlyCost());
		        String competitionCostFormatted = formatter.format(Entity.getCompetitionCost());
		        String coachingCostFormatted = formatter.format(Entity.getPrivateCoachingCost());
		        
		        
		        //SUMMARY
		        System.out.println("");
		        System.out.println("======= SUMMMARY ========");
		        System.out.println("");
		        System.out.println("Athlete's Name: " + Entity.getName());
		        System.out.println("");
		        System.out.println("Cost for Monthly Training: " + monthlyCostFormatted);
		        System.out.println("");
		        System.out.println("Cost for Competition: " + competitionCostFormatted);
		        System.out.println("");
		        System.out.println("Weight category for competition : " + Entity.getWCategory());
		        System.out.println("");
		        System.out.println("Cost for Private Coaching: " + coachingCostFormatted);
		        System.out.println("");
		        System.out.println("Total Cost: " + totalCostFormatted);
		        System.out.println("");
		        System.out.println("======= END OF SUMMARY =======");
		       
		    }
		}