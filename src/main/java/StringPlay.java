import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;
public class StringPlay {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Something: ");
        String userString = userInput.nextLine();
        methodHolder(userString);
    }

    public static void methodHolder(String input){
        outputString(input);
        isANumber(input);
        flipCase(input);
        reverseString(input);
    }

    public static String outputString(String input){
        return String.format("You Entered: \"%s\"", input);
    }

    public static void isANumber(String input){
        if (StringUtils.isNumeric(input)){
            System.out.printf("\"%s\" is a number\n", input);
        } else {
            System.out.printf("\"%s\" is not a number\n", input);
        }
    }

    public static void flipCase(String input){
        System.out.printf("Flipped Case: %s\n", StringUtils.swapCase(input));
    }

    public static void reverseString(String input){
        System.out.printf("Reversed: %s", StringUtils.reverse(input));
    }

}
