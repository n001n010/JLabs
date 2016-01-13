package L1.DemoClasses;

import static java.lang.System.out;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CircleTest {
    private final Circle o;
    
    {
        o = new Circle(new Point(0,0),4);
    }
    
    @Test
    public void testCircleInfoOutput(){
        out.println(o+".");
    }
    
    @Test
    public void testCirclePerimeterCalculation(){
        assertEquals(25.13,o.calculatePerimeter(),0.01);
    }
    
    @Test
    public void testCircleAreaCalculation(){
        assertEquals(50.26,o.calculateArea(),0.01);
    }
}