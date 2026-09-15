package tetris.model;

public class Game {

    private final Board board;

    private GameStatus status;

    public Game(Board board) {
        this.board = board;
        this.status = GameStatus.READY;
    }

    /**
     * 게임을 시작 가능한 상태에서 실행 상태로 변경한다.
     */
    public void start() {
        if (status != GameStatus.READY) {
            return;
        }

        status = GameStatus.PLAYING;
    }

    /**
     * 사용자 명령을 현재 게임 상태에 적용한다.
     */
    public void handleCommand(GameCommand command) {
        if (status != GameStatus.PLAYING) {
            return;
        }

        if (command == GameCommand.EXIT) {
            status = GameStatus.EXIT;
        }
    }

    public boolean isFinished() {
        return status == GameStatus.EXIT;
    }

    public GameSnapshot createSnapshot() {
        return new GameSnapshot(
                board.copyCells(),
                status
        );
    }
}