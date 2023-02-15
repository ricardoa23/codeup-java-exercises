public class DishTest {
    public static void main(String[] args) {
//        Dish dish1 = new Dish();
//        dish1.costInCents = 825;
//        dish1.nameOfDish = "Tacos With Rice and Beans";
//        dish1.wouldRecommend = true;
//
//        Dish dish2 = new Dish();
//        dish2.costInCents = 200;
//        dish2.nameOfDish = "Chips and Salas";
//        dish2.wouldRecommend = true;




//        dish1.printSummary();
//        DishTools.analyzeDishCost(dish1);
//        DishTools.shoutDishName(dish1);
//        DishTools.flipRecommendation(dish1);
//        dish1.printSummary();
//        dish2.printSummary();
//        DishTools.analyzeDishCost(dish2);
//        DishTools.shoutDishName(dish2);

        Dish tacos = new Dish(900, "Tacos With rice and Beans", true);
        tacos.printSummary();
        DishTools.flipRecommendation(tacos);
        tacos.printSummary();

    }

}
