package RockPaperScissor;

public class Conditions {
    private int winner;
    private String player1Name;
    private String player2Name;

    public Conditions(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void setWinner(char player1, char player2) {
        if (player1 == 'p' && player2 == 'r') {
            winner = 1;
        } else if (player1 == 'r' && player2 == 'p') {
            winner = 2;
        } else if (player1 == 's' && player2 == 'p') {
        winner = 1;
        } else if (player1 == 'p' && player2 == 's') {
            winner = 2;
        } else if (player1 == 'r' && player2 == 's') {
            winner = 1;
        } else if (player1 == 's' && player2 == 'r') {
            winner = 2;
        } else if (player1 == player2) {
            winner = 0;
        }
    }

    public void getWinner() {
        switch (winner) {
            case 1:
                System.out.println(player1Name + " wins.");
                break;
            case 2:
                System.out.println(player2Name + " wins.");
                break;
            case 0:
                System.out.println("No one wins.");
                break;
        }
    }
}
