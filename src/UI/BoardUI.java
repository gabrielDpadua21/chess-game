package UI;

import game.ChessPiece;

public class BoardUI {

    public static void printBoard(ChessPiece[][] chessPieces) {
        String[] downPositions = {"", "a", "b", "c", "d", "e", "f", "g", "h"};
        for (int i = 0; i < chessPieces.length; i++) {
            System.out.print(STR."\{8-i} ");
            for (int j = 0; j < chessPieces.length; j++) {
                printPiece(chessPieces[i][j]);
            }
            System.out.println("");
        }

        for (int i = 0; i < downPositions.length; i ++) {
            System.out.print(STR." \{downPositions[i]}");
        }
    }

    private static void printPiece(ChessPiece piece) {
        if (piece == null) System.out.print("_");
        if (piece != null) System.out.print(piece);
        System.out.print(" ");
    }

}
