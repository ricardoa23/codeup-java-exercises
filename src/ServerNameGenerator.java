public class ServerNameGenerator {

    public static String randomElement(String[] array) {
        double randomizer = Math.floor(Math.random() * (array.length - 1));
        int i = (int) randomizer;
        return array[i];
    }


    public static void main(String[] args) {
   String[] adjectives = {"happy", "sad", "healthy", "confused", "stressed", "organized", "over-zealous", "bubbly", "bright", "dark"};
   String[] nouns = {"boy", "girl", "teacher", "assistant", "class", "student", " rubber duck", "staff member", "developer", "programmer" };

        String testNoun = randomElement(nouns);
        String testAdjective = randomElement(adjectives);
        System.out.printf("Here is your server name:\n%s-%s", testAdjective, testNoun);
    }



}
