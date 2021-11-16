package baseball;

import java.util.Objects;

public class Ball {
    private final int index;
    private final int ballNo;

    public Ball(int index, int ballNo) {
        this.index = index;
        this.ballNo = ballNo;
    }

    public BallStatus playGame(Ball ball){
        if(equals(ball)){
            return BallStatus.STRIKE;
        }
        if(matchBallNo(ballNo)){
            return BallStatus.BALL;
        }

        return BallStatus.NOTHING;
    }

    private boolean matchBallNo(int ballNo) {
        return this.ballNo == ballNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ball)) return false;
        Ball ball = (Ball) o;
        return index == ball.index && ballNo == ball.ballNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, ballNo);
    }
}
