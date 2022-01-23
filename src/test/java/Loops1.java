import loops.LoopsPractise;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * @author Michael Wagih
 */
public class Loops1 {

    private LoopsPractise loopsPractise;

    @BeforeEach
    void setUp() {
        loopsPractise = new LoopsPractise();
    }

    @Test
    void multiplyTutorial_getNumersBetween2to_20_path() {
        boolean b = loopsPractise.multiplyTutorial(2);
        loopsPractise.multiplyTutorial(20);
//        assertTrue();
    }

}
