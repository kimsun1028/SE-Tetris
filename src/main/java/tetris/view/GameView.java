package tetris.view;

import java.util.function.Consumer;

import tetris.model.GameCommand;
import tetris.model.GameSnapshot;

public interface GameView {

    void setCommandHandler(Consumer<GameCommand> commandHandler);

    void render(GameSnapshot snapshot);

    void show();

    void close();
}