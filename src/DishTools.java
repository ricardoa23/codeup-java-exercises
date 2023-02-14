
public class DishTools {
    final public static int AverageCostOfDishInCents = 1300;

    public static void  shoutDishName( Dish dish) {
        System.out.println(dish.nameOfDish.toUpperCase());
    }

    public static void analyzeDishCost(Dish dish) {
        if(dish.costInCents > AverageCostOfDishInCents) {
            System.out.println("\nMore expensive than the average");
        } else if(dish.costInCents < AverageCostOfDishInCents) {
            System.out.println("\nLess expensive than the average");
        } else {
            System.out.println("\nIt's the average amount");
        }
    }

    public static boolean flipRecommendation(Dish dish) {
        return dish.wouldRecommend = !dish.wouldRecommend;
    }

}
