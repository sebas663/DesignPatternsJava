package examples.mealtwo;

import examples.mealtwo.builder.MealBuilder;
import examples.mealtwo.builder.NonVegMealBuilder;
import examples.mealtwo.builder.VegMealBuilder;
import examples.mealtwo.director.MealDirector;
import examples.mealtwo.product.Meal;

public class PatternDemo {
	public static void main(String[] args) {

		MealDirector director = new MealDirector();
		
		MealBuilder builder = null;

		builder = new VegMealBuilder();
		Meal vegMeal = director.createMeal(builder);
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());

		builder = new NonVegMealBuilder();
		Meal nonVegMeal = director.createMeal(builder);
		System.out.println("\n\nNon-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
	}
}
