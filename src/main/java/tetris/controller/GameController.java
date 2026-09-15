package tetris.controller;

import tetris.model.Game;
import tetris.model.GameCommand;
import tetris.model.GameSnapshot;
import tetris.view.GameView;

public class GameController {

    private final Game game;
    private final GameView view;

    public GameController(Game game, GameView view) {
        this.game = game;
        this.view = view;
    }

    public void start() {
        view.setCommandHandler(this::handleCommand);

        game.start();
        refreshView();

        view.show();
    }

    private void handleCommand(GameCommand command) {
        game.handleCommand(command);
        refreshView();

        if (game.isFinished()) {
            view.close();
        }
    }

    private void refreshView() {
        GameSnapshot snapshot = game.createSnapshot();
        view.render(snapshot);
    }
}