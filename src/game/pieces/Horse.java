package game.pieces;

import board.Board;
import game.ChessPiece;
import game.Color;

public class Horse extends ChessPiece {
    public Horse(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "H";
    }
}
