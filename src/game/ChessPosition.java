package game;

import board.Position;

public class ChessPosition {

    private final int row;
    private final char col;

    public ChessPosition(int row, char col) {
        if (row < 0 || row > 8 || col < 'a' || col > 'h') throw new ChessException("Invalid position");
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public char getCol() {
        return col;
    }

    protected Position toPosition() {
        return new Position(8 - row, col - 'a');
    }

    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((8 - position.getRow()), (char)('a' - position.getColumn()));
    }

    @Override
    public String toString() {
        return STR."\{col}\{row}";
    }
}
