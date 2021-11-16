package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    private Ball com;

    @BeforeEach
    void setUp(){
        com =  new Ball(1,1);
    }

    @Test
    void strike(){
        BallStatus result = com.playGame(new Ball(1,1));
        assertThat(result).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void ball(){
        BallStatus result = com.playGame(new Ball(2,1));
        assertThat(result).isEqualTo(BallStatus.BALL);
    }

    @Test
    void nothing(){
        BallStatus result = com.playGame(new Ball(2,4));
        assertThat(result).isEqualTo(BallStatus.NOTHING);
    }
}
