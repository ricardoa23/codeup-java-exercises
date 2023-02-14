public class Dish {
    public double costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;

    public void printSummary() {
        System.out.printf("\nCost: %.0f cents\n Name: %s\n Recommended: %b" , costInCents, nameOfDish, wouldRecommend);
    }

}
