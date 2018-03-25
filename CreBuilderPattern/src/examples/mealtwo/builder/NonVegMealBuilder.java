package examples.mealtwo.builder;

import examples.mealtwo.builder.MealBuilder;
import examples.mealtwo.product.ChickenBurger;
import examples.mealtwo.product.Meal;
import examples.mealtwo.product.Pepsi;

public class NonVegMealBuilder extends MealBuilder {

	@Override
	public void prepareMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		this.meal = meal;
	}
	
	@Override
	public Meal getMeal() {
		return this.meal;
	}

}
