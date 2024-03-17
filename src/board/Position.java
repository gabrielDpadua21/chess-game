package board;

import static java.lang.StringTemplate.STR;

public class Position {

    private int row;
    private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return STR."\{this.row}, \{this.column}";
    }

    public void setValues(int row, int column) {
        this.column = column;
        this.row = row;
    }

}