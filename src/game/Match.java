package game;

import board.Board;
import board.Position;
import game.pieces.*;

public class Match {

    private final Board board;

    public Match() {
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] matrix = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i=0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                matrix[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return matrix;
    }

    private void placeNewPiece(char column, int row, ChessPiece piece) {
        board.placePiece(piece, new ChessPosition(row, column).toPosition());
    }

    private void initialSetup() {
        placeNewPiece('a', 8, new Rook(this.board, Color.BLACK));
        board.placePiece(new Rook(this.board, Color.BLACK), new Position(0, 7));
        board.placePiece(new Horse(this.board, Color.BLACK), new Position(0, 1));
        board.placePiece(new Horse(this.board, Color.BLACK), new Position(0, 6));
        board.placePiece(new Bishop(this.board, Color.BLACK), new Position(0, 2));
        board.placePiece(new Bishop(this.board, Color.BLACK), new Position(0, 5));
        board.placePiece(new King(this.board, Color.BLACK), new Position(0, 4));
        board.placePiece(new Queen(this.board, Color.BLACK), new Position(0, 3));
        board.placePiece(new Pawn(this.board, Color.BLACK), new Position(1, 0));
        board.placePiece(new Pawn(this.board, Color.BLACK), new Position(1, 1));
        board.placePiece(new Pawn(this.board, Color.BLACK), new Position(1, 2));
        board.placePiece(new Pawn(this.board, Color.BLACK), new Position(1, 3));
        board.placePiece(new Pawn(this.board, Color.BLACK), new Position(1, 4));
        board.placePiece(new Pawn(this.board, Color.BLACK), new Position(1, 5));
        board.placePiece(new Pawn(this.board, Color.BLACK), new Position(1, 6));
        board.placePiece(new Pawn(this.board, Color.BLACK), new Position(1, 7));

        board.placePiece(new Rook(this.board, Color.WHITE), new Position(7, 0));
        board.placePiece(new Rook(this.board, Color.WHITE), new Position(7, 7));
        board.placePiece(new Horse(this.board, Color.WHITE), new Position(7, 1));
        board.placePiece(new Horse(this.board, Color.WHITE), new Position(7, 6));
        board.placePiece(new Bishop(this.board, Color.WHITE), new Position(7, 2));
        board.placePiece(new Bishop(this.board, Color.WHITE), new Position(7, 5));
        board.placePiece(new King(this.board, Color.WHITE), new Position(7, 4));
        board.placePiece(new Queen(this.board, Color.WHITE), new Position(7, 3));
        board.placePiece(new Pawn(this.board, Color.WHITE), new Position(6, 0));
        board.placePiece(new Pawn(this.board, Color.WHITE), new Position(6, 1));
        board.placePiece(new Pawn(this.board, Color.WHITE), new Position(6, 2));
        board.placePiece(new Pawn(this.board, Color.WHITE), new Position(6, 3));
        board.placePiece(new Pawn(this.board, Color.WHITE), new Position(6, 4));
        board.placePiece(new Pawn(this.board, Color.WHITE), new Position(6, 5));
        board.placePiece(new Pawn(this.board, Color.WHITE), new Position(6, 6));
        board.placePiece(new Pawn(this.board, Color.WHITE), new Position(6, 7));
    }
}
