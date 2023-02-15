
public class DishTools {
    final private static int AverageCostOfDishInCents = 1300;

    public static void  shoutDishName( Dish dish) {
        System.out.println(dish.getNameOfDish().toUpperCase());
    }

    public static void analyzeDishCost(Dish dish) {
        if(dish.getCostInCents() > AverageCostOfDishInCents) {
            System.out.println("\nMore expensive than the average");
        } else if(dish.getCostInCents() < AverageCostOfDishInCents) {
            System.out.println("\nLess expensive than the average");
        } else {
            System.out.println("\nIt's the average amount");
        }
    }

    public static void flipRecommendation(Dish value) {
        value.setWouldRecommend(!value.getWouldRecommend());
    }

}
