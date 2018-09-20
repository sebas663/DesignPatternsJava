package examples.meal.director;

import examples.meal.builder.MealBuilder;
import examples.meal.product.Meal;

//Director
public class MealDirector {
	public Meal createMeal(MealBuilder builder) {
		builder.buildDrink();
		builder.buildMain();
		builder.buildDessert();
		return builder.getMeal();
	}
}
