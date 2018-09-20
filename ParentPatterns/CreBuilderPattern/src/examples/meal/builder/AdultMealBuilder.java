package examples.meal.builder;

import examples.meal.product.Meal;

public class AdultMealBuilder extends MealBuilder {
	public void buildDrink() {
		// add drinks to the meal
	}

	public void buildMain() {
		// add main part of the meal
	}

	public void buildDessert() {
		// add dessert part to the meal
	}

	public Meal getMeal() {
		return meal;
	}

}
