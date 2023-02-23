public class ExceptionsMiniExercises {

    static final private String string = "I am a test String";
    static int stringLength;

    public ExceptionsMiniExercises() {}

    public static void main(String[] args) {
        ExceptionsMiniExercises test = new ExceptionsMiniExercises();
        try{
            stringLength = string.length();
            System.out.println(test.string.substring(-1, 3));
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
        System.out.println(stringLength);
    }


}
