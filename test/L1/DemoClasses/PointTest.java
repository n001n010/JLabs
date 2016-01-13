package L1.DemoClasses;

import static org.junit.Assert.*;
import static java.lang.System.out;

import org.junit.Test;

public class PointTest {
    private final Point a;
    private final Point b;
    private final Point c;
    
    {
        a = new Point(0,0);
        b = new Point(0,10);
        c = new Point(0,0);
    }

    @Test
    public void testPointInfoOutput(){
        out.println(a+".");
    }
    
    @Test
    public void testPointsEquality(){
        assertTrue(a.equals(c));
        assertFalse(a.equals(b));
    }
    
    @Test
    public void testPointToPointDistanceFinding(){
        assertEquals(10,a.findDistanceToAnotherPoint(b),0);
    }
}