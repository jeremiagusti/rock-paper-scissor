package RockPaperScissor;

public class Player {
    private String name;
    private char choice;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setChoice(char choice) {
        this.choice = choice;
    }

    public char getChoice() {
        return this.choice;
    }
}
