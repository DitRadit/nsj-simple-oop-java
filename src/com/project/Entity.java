package com.project;

public class Entity {
	//Declaring the parameters
	private static String name;
	private static int currentWeight;
	private static String weightCategory;
	private static String trainingPlan;
	private static int numberOfCompetitions;
	private static boolean joinCompetition;
	private static boolean privateCoaching;
	private static int numberOfHours;
	private static int monthlyCost;
	private static int competitionCost;
	private static int coachingCost;
	
	//Define getters and setters
	
	//NAME------------------------------------------------------------------------
	
	
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
        Entity.name = name;
    }

	
	//WEIGHT---------------------------------------------------------------------
	
    public static int getWeight() {
        return currentWeight;
    }

    public static void setWeight(int currentWeight) {
        Entity.currentWeight = currentWeight;
    }
    
    public static String getWCategory() {
    	return weightCategory;
    }
    
    public static void setWCategory(String weightCategory) {
    	Entity.weightCategory  = weightCategory;
    }
    
    //TRAINING PLAN--------------------------------------------------------------
    
    public static String getPlan() {
        return trainingPlan;
    }

    public static void setPlan(String trainingPlan) {
        Entity.trainingPlan = trainingPlan;
    }
    
    //COMPETITIONS---------------------------------------------------------------

    public static int getNumberOfCompetitions() {
        return numberOfCompetitions;
    }

    public static void setNumberOfCompetitions(int numberOfCompetitions) {
        Entity.numberOfCompetitions = numberOfCompetitions;
    }

    public static boolean isJoinCompetition() {
        return joinCompetition;
    }

    public static void setJoinCompetition(boolean joinCompetition) {
        Entity.joinCompetition = joinCompetition;
    }
    
    
    //PRIVATE COACHING----------------------------------------------------------
    

    public static boolean isFollowPrivateCoaching() {
        return privateCoaching;
    }

    public static void setFollowPrivateCoaching(boolean followPrivateCoaching) {
        Entity.privateCoaching = followPrivateCoaching;
    }
    public static int getNumberOfHours() {
        return numberOfCompetitions;
    }

    public static void setNumberOfHours(int numberOfHours) {
        Entity.numberOfHours = numberOfHours;
    }
    //COST FEE------------------------------------------------------------------

    public static int getMonthlyCost() {
        return monthlyCost;
    }

    public static void setMonthlyCost(int monthlyCost) {
        Entity.monthlyCost = monthlyCost;
    }

    public static int getCompetitionCost() {
        return competitionCost;
    }

    public static void setCompetitionCost(int competitionCost) {
        Entity.competitionCost = competitionCost;
    }

    public static int getPrivateCoachingCost() {
        return coachingCost;
    }

    public static void setPrivateCoachingCost(int privateCoachingCost) {
        Entity.coachingCost = privateCoachingCost;
    }
	
	
	
}
