import java.util.*;

class Food implements Comparable<Food> {
    public int foodRating;
    public String foodName;

    public Food(int foodRating, String foodName) {
        this.foodRating = foodRating;
        this.foodName = foodName;
    }

    @Override
    public int compareTo(Food other) {
        if (foodRating == other.foodRating) {
            return foodName.compareTo(other.foodName);
        }
        return -1 * Integer.compare(foodRating, other.foodRating);
    }
}

class FoodRatings {
    private Map<String, Integer> foodRatingMap;
    private Map<String, String> foodCuisineMap;
    private Map<String, PriorityQueue<Food>> cuisineFoodMap;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodRatingMap = new HashMap<>();
        foodCuisineMap = new HashMap<>();
        cuisineFoodMap = new HashMap<>();

        for (int i = 0; i < foods.length; ++i) {
            foodRatingMap.put(foods[i], ratings[i]);
            foodCuisineMap.put(foods[i], cuisines[i]);
            cuisineFoodMap.computeIfAbsent(cuisines[i], k -> new PriorityQueue<>()).add(new Food(ratings[i], foods[i]));
        }
    } 
    
    public void changeRating(String food, int newRating) {
        foodRatingMap.put(food, newRating);
        String cuisineName = foodCuisineMap.get(food);
        cuisineFoodMap.get(cuisineName).add(new Food(newRating, food));
    }
    
    public String highestRated(String cuisine) {
        Food highestRated = cuisineFoodMap.get(cuisine).peek();
        while (foodRatingMap.get(highestRated.foodName) != highestRated.foodRating) {
            cuisineFoodMap.get(cuisine).poll();
            highestRated = cuisineFoodMap.get(cuisine).peek();
        }
        return highestRated.foodName;
    }
}
public class Main{
public static void main(String[] args) {
 String[] foods = {"sushi", "ramen", "burger", "taco"};
        String[] cuisines = {"japanese", "japanese", "american", "mexican"};
        int[] ratings = {5, 7, 8, 6};

        FoodRatings foodRatings = new FoodRatings(foods, cuisines, ratings);

        System.out.println("Highest rated Japanese: " + foodRatings.highestRated("japanese")); // ramen
        System.out.println("Highest rated American: " + foodRatings.highestRated("american")); // burger

        // Change rating
        foodRatings.changeRating("sushi", 9);
        System.out.println("Highest rated Japanese after update: " + foodRatings.highestRated("japanese")); // sushi
    
}}
