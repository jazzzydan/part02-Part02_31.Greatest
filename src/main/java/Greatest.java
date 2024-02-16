
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {

        // Using the ternary operator to find the maximum of two numbers
        int max = (number1 > number2) ? number1 : number2;

        // Using the ternary operator to find the maximum of three numbers
        int greatestNum = (max > number3) ? max : number3;

        return greatestNum;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
