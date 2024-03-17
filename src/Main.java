import UI.BoardUI;
import game.Match;

public class Main {
    public static void main(String[] args) {
        System.out.println("Chess Game!");

        Match match = new Match();

        BoardUI.printBoard(match.getPieces());

    }
}