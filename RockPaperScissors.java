import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Lets play Rock Paper Scissors.");
        System.out.println("when I say 'shoot, Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String response = scan.nextLine();

        if(response.equals("yes")) {
            System.out.println("Great!");
            System.out.println("rock - paper - scissors, shoot!");
            String userChoice = scan.nextLine();
            String compChoice = computerChoice();

            System.out.println("\nYou chose: " + userChoice);
            System.out.println("The computer chose: " + compChoice);

            String finalResult = result(userChoice, compChoice);
            printResult(userChoice, compChoice, finalResult);


        } else {
            System.out.println("Darn, some other time...!");
        }

        scan.close();

    //Task 1: Se if the user wants to play.

    }

    public static String computerChoice() {
        int randomNumber = (int)(Math.random() * 3);
        if (randomNumber == 0) {
            return "rock";
        } else if (randomNumber == 1) {
            return "paper";
        } else if (randomNumber == 2) {
            return "scissors";

        }else{
            return "Error in the app. please visit this bug.";

        }
    }
    public static String result (String userChoice, String computerChoice) {
        String result = "";

        if (userChoice.equals("rock") && computerChoice.equals("scissors")) {
            return "You win!";
        } else if (userChoice.equals("paper") && computerChoice.equals("rock")) {
            return "You win!";
        } else if (userChoice.equals("scissors") && computerChoice.equals("paper")) {
            return "You win!";


        } else if (computerChoice.equals("rock") && userChoice.equals("scissors")) {
            return "You lose!";
        } else if (computerChoice.equals("paper") && userChoice.equals("rock")) {
            return "You lose!";
        } else if (computerChoice.equals("scissors") && userChoice.equals("paper")) {
            return "You lose!";
        } else if (userChoice.equals(computerChoice)) {
            return "Its a tie!";
        } else {
            System.out.println("INVALID CHOICE");
            System.exit(0);
        }

        return result;
    }

    public static void printResult(String userChoice, String computerChoice, String result) {
        System.out.println("You chose: " + userChoice);
        System.out.println("The computer chose:" + computerChoice);
        System.out.println(result);
    }

}