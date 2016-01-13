package L1.DemoClasses;

import L1.Exceptions.GeometricException;
import static java.lang.System.out;
import org.junit.Test;

public class SegmentTest {
    private Segment ab;
    
    {
        try{
            ab = new Segment(new Point(0,0),new Point(0,10),"AB"); 
        }
        catch (GeometricException e){
            e.printStackTrace();
        }
    }
    
    @Test
    public void testSegmentInfoOutput(){
        out.println(ab+".");
    }
    
    @Test(expected=GeometricException.class)
    public void testSegmentPerimeterCalculation() throws GeometricException{
         ab.calculatePerimeter();
    }
    
    @Test(expected=Exception.class)
    public void testSegmentAreaCalculation() throws GeometricException{
         ab.calculateArea();
    }
}