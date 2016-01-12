package L1.DemoClasses;

import static org.junit.Assert.*;

import org.junit.Test;

public class PointTest {
    private final Point a;
    private final Point b;
    
    {
        a = new Point(0,0);
        b = new Point(0,10);
    }

    @Test
    public void testPointToPointDistanceFinding(){
        assertEquals(10,a.findDistanceToAnotherPoint(b),0);
    }
}