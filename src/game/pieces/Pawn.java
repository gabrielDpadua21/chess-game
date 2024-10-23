package game.pieces;

import board.Board;
import game.ChessPiece;
import game.Color;

public class Pawn extends ChessPiece {
    public Pawn(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "P";
    }
}
