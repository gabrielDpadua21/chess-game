package game.pieces;

import board.Board;
import game.ChessPiece;
import game.Color;

public class Bishop extends ChessPiece {
    public Bishop(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "B";
    }
}
