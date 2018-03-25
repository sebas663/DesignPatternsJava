package examples.meal.builder;

import examples.meal.product.Meal;

//Builder
public abstract class MealBuilder {
	protected Meal meal = new Meal();

	public abstract void buildDrink();

	public abstract void buildMain();

	public abstract void buildDessert();

	public abstract Meal getMeal();
}
