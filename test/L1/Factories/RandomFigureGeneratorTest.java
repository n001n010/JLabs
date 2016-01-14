package L1.Factories;

import static java.lang.System.out;
import org.junit.Test;

public class RandomFigureGeneratorTest {
    private final RandomFigureGenerator rnd;
    
    {
        rnd=new RandomFigureGenerator();
    }
    
    @Test
    public void testRandomFigureGenerator() {
        out.println(rnd.GenerateRandomFigure());
    }
}