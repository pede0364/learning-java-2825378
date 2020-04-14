import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String question = "What is your favorite color?";
        String choiceOne = "Orange";
        String choiceTwo = "Green";
        String choiceThree = "Silver";

        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);

        // Have the user input an answer
        String userInput = input.next();

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the
        // user.
        if (userInput.equals(correctAnswer)) {
            System.out.println("You're right!");
        }

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the
        // user is incorrect as well as what the correct choice was.
        else {
            System.out.println("Sorry, the correct answer is " + correctAnswer);
        }
    }

}
