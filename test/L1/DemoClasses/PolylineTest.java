package L1.DemoClasses;

import L1.Exceptions.GeometricException;
import static java.lang.System.out;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class PolylineTest {
    private final Polyline poly;
    
    {
        poly=new Polyline();
        try{
            poly.addElement(new Point (0,1), "A");
            poly.addElement(new Point (1,1), "B");
            poly.addElement(new Point (1,-1), "C");
        }
        catch(GeometricException e){
            e.printStackTrace();
        }
    }
        
    @Test
    public void testPolylineInfoOutput(){
        out.println(poly+".");
    }
    
    @Test
    public void testPolylineChanges() throws GeometricException{
                
        poly.addElement(new Point(2,-1), "D");
        testPolylineInfoOutput();
        out.println(poly.isElementAlreadyExists(new Point(2,-1)) ? "true" : "false");
        poly.removeElement(new Point(2,-1));
        assertFalse(poly.isElementAlreadyExists(new Point(2,-1)));
    }
    
    @Test
    public void testPolylinePerimeterCalculation(){
        assertEquals(3,poly.calculatePerimeter(),0);
    }
    
    @Test(expected=GeometricException.class)
    public void testPolylineAreaCalculation() throws GeometricException{
        poly.calculateArea();
    }
}