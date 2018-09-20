package examples.mealtwo.director;

import examples.mealtwo.builder.MealBuilder;
import examples.mealtwo.product.Meal;

public class MealDirector {
	public Meal createMeal(MealBuilder builder) {
		builder.prepareMeal();
		return builder.getMeal();
	}
}
