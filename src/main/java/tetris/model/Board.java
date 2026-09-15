package tetris.model;

public class Board {

    private static final int EMPTY_CELL = 0;

    private final int width;
    private final int height;
    private final int[][] cells;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.cells = new int[height][width];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getCell(int row, int column) {
        return cells[row][column];
    }

    public boolean isEmpty(int row, int column) {
        return cells[row][column] == EMPTY_CELL;
    }

    public int[][] copyCells() {
        int[][] copy = new int[height][width];

        for (int row = 0; row < height; row++) {
            System.arraycopy(cells[row], 0, copy[row], 0, width);
        }

        return copy;
    }
}