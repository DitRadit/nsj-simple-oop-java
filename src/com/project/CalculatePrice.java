package com.project;

public class CalculatePrice extends UserInput {
	public int calculateTotalCost() {
		int totalCost = Entity.getMonthlyCost() + Entity.getCompetitionCost() + Entity.getPrivateCoachingCost();
		return totalCost;
	}
	
}
