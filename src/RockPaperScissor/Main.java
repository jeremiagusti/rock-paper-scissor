package RockPaperScissor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Rock Paper Scissor.");

        System.out.print("Enter Player 1 name: ");
        Player player1 = new Player(input.next());

        System.out.print("Enter Player 2 name: ");
        Player player2 = new Player(input.next());

        System.out.println("The players are: " + player1.getName() + " and " + player2.getName());
        System.out.println("Input your choice: ");

        System.out.print(player1.getName() + ": ");
        player1.setChoice(input.next().charAt(0));

        System.out.print(player2.getName() + ": ");
        player2.setChoice(input.next().charAt(0));

        // Processing
        Conditions thisRoundWinner = new Conditions(player1.getName(), player2.getName());
        thisRoundWinner.setWinner(player1.getChoice(), player2.getChoice());
        thisRoundWinner.getWinner();

        input.close();
    }
}
