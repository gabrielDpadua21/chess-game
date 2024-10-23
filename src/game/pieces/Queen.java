package game.pieces;

import board.Board;
import game.ChessPiece;
import game.Color;

public class Queen extends ChessPiece {

    public Queen(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "Q";
    }
}
