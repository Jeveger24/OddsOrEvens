import java.util.*;

public class OddsOrEvens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to play \"Odds or Evens\"? ");
        String ans = input.nextLine();

        while (ans.equalsIgnoreCase("yes")) {
            System.out.println("Alright! Let's play a game called \"Odds or Evens\"");
            System.out.print("What is your name? ");
            String name = input.nextLine();
            System.out.print("Hello " + name + ", which do you choose? (0)dds or (E)vens? ");
            String choice = input.nextLine();
            if (choice.equalsIgnoreCase("o")) {
                System.out.println(name + " has picked Odds! The computer will be Evens.");
            } else {
                System.out.println(name + " has picked Evens! The computer will be Odds.");
            }
            System.out.println("-----------------------------------------");
            System.out.println();

            System.out.print("How many \"fingers\" do you put out? ");
            int fingers = input.nextInt();
            input.nextLine();
            Random rand = new Random();
            int computer = rand.nextInt(6);
            System.out.println("The computer plays number \"" + computer + "\".");
            System.out.println("-----------------------------------------");
            System.out.println();

            int sum = fingers + computer;
            System.out.println(fingers + " + " + computer + " = " + sum);
            boolean oddoreven = sum % 2 == 0;
            if (oddoreven) {
                System.out.println(sum + " is even!");
                if (choice.equalsIgnoreCase("e")) {
                    System.out.println("You Win!");
                } else {
                    System.out.println("You lost, the computer wins!");
                }
            } else {
                System.out.println(sum + " is odd!");
                if (choice.equalsIgnoreCase("o")) {
                    System.out.println("You Win!");
                } else {
                    System.out.println("You lost, the computer wins!");
                }
            }
            System.out.println("-----------------------------------------");
            System.out.println();

            System.out.println("Do you want to play again? ");
            ans = input.nextLine();
        }
        System.out.println("Thank you for playing. Goodbye!");
    }
}
