package examples.meal;

import examples.meal.builder.AdultMealBuilder;
import examples.meal.builder.KidsMealBuilder;
import examples.meal.builder.MealBuilder;
import examples.meal.director.MealDirector;
import examples.meal.product.Meal;

public class PatternDemo {
	public static void main(String[] args) {
		MealDirector director = new MealDirector();
		MealBuilder builder = null;
		boolean isKid = Boolean.getBoolean(args[0]);
		if (isKid) {
			builder = new KidsMealBuilder();
		} else {
			builder = new AdultMealBuilder();
		}
		Meal meal = director.createMeal(builder);
	}
}
