package tetris;

import javafx.application.Application;
import javafx.stage.Stage;

import tetris.controller.GameController;
import tetris.model.Board;
import tetris.model.Game;
import tetris.model.GameConfig;
import tetris.view.GameView;
import tetris.view.JavaFxGameView;

public class TetrisApplication extends Application {

    private static final int TEMP_BOARD_WIDTH = 10;
    private static final int TEMP_BOARD_HEIGHT = 20;

    @Override
    public void start(Stage stage) {
        GameConfig config = new GameConfig(
                TEMP_BOARD_WIDTH,
                TEMP_BOARD_HEIGHT
        );

        Board board = new Board(
                config.getBoardWidth(),
                config.getBoardHeight()
        );

        Game game = new Game(board);
        GameView view = new JavaFxGameView(stage);

        GameController controller = new GameController(game, view);

        controller.start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}