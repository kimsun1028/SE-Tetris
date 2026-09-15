package tetris.model;

public class GameConfig {

    private final int boardWidth;
    private final int boardHeight;

    public GameConfig(int boardWidth, int boardHeight) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
    }

    public int getBoardWidth() {
        return boardWidth;
    }

    public int getBoardHeight() {
        return boardHeight;
    }
}