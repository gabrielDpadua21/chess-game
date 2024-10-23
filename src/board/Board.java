package board;

public class Board {

    private final int rows;
    private final int columns;
    private final Piece[][] pieces;

    public Board(int rows, int columns) {
        if (rows < 1 || columns < 1) throw new BoardException("Error to create board!!!");
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Piece piece(int row, int column) {
        if (positionExists(row, column)) throw new BoardException("position not exists");
        return pieces[row][column];
    }

    public Piece piece(Position position) {
        if(positionExists(position)) throw new BoardException("position not exists");
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position) {
        if (thereIsAPiece(position)) throw new BoardException(STR."there is a piece in position: \{position.getRow()} \{position.getColumn()}");
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position) {
        if (positionExists(position)) throw new BoardException("position not exists");
        return piece(position) != null;
    }

    private boolean positionExists(int row, int col) {
        return row < 0 || row >= rows || col < 0 || col >= columns;
    }
}
