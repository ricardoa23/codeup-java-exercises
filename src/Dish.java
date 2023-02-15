public class Dish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;


    public Dish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "costInCents=" + costInCents +
                ", nameOfDish='" + nameOfDish + '\'' +
                ", wouldRecommend=" + wouldRecommend +
                '}';
    }

    public int getCostInCents() {
        return costInCents;
    }
    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean getWouldRecommend() {
        return  wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }


    public void printSummary() {
        System.out.printf("----------------------\nCost: %d cents\nName: %s\nRecommended: %b\n" , costInCents, nameOfDish, wouldRecommend);
    }

}
