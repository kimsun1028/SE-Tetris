package tetris.model;

public class GameSnapshot {

    private final int[][] cells;
    private final GameStatus status;

    public GameSnapshot(int[][] cells, GameStatus status) {
        this.cells = copyCells(cells);
        this.status = status;
    }

    public int[][] getCells() {
        return copyCells(cells);
    }

    public GameStatus getStatus() {
        return status;
    }

    private int[][] copyCells(int[][] source) {
        int[][] copy = new int[source.length][];

        for (int row = 0; row < source.length; row++) {
            copy[row] = source[row].clone();
        }

        return copy;
    }
}