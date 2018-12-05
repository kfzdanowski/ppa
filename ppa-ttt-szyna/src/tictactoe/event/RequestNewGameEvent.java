package tictactoe.event;

public class RequestNewGameEvent implements TicTacToeEvent {
    protected boolean type;

    public void setType(boolean type) {
        this.type = type;
    }

    public boolean Type() {
        return type;
    }

}
