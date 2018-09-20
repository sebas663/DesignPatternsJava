package examples.mealtwo.builder;

import examples.mealtwo.product.Coke;
import examples.mealtwo.product.Meal;
import examples.mealtwo.product.VegBurger;

public class VegMealBuilder extends MealBuilder {

	@Override
	public void prepareMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		this.meal = meal;
	}

	@Override
	public Meal getMeal() {
		return this.meal;
	}

}
