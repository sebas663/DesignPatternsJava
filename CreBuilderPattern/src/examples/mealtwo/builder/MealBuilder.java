package examples.mealtwo.builder;

import examples.mealtwo.product.Meal;

public abstract class MealBuilder {
	
	protected Meal meal = new Meal();

	public abstract void prepareMeal();
	public abstract Meal getMeal();

}
