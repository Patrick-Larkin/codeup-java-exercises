package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getString("Enter a sentence"));
        System.out.println(input.yesNo("Do you want to continue?(Yes/No)"));
        System.out.println(input.getInt());
        System.out.println(input.getInt("Enter an Integer"));
        System.out.println(input.getDouble());
        System.out.println(input.getDouble("Enter a Double"));
    }
}