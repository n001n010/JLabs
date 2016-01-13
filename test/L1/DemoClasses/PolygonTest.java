package L1.DemoClasses;

import L1.Exceptions.GeometricException;
import static java.lang.System.out;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PolygonTest {
    private final Polygon polyG;
    
    {
        polyG=new Polygon();
        try{
            polyG.addElement(new Point (0,1), "A");
            polyG.addElement(new Point (1,1), "B");
            polyG.addElement(new Point (1,-1), "C");
        }
        catch(GeometricException e){
            e.printStackTrace();
        }
    }
        
    @Test
    public void testPolygonInfoOutput(){
        out.println(polyG+".");
    }

    @Test
    public void testPolygonPerimeterCalculation(){
        assertEquals(5.23,polyG.calculatePerimeter(),0.1);
    }
    
    @Test
    public void testPolygonAreaCalculation() throws GeometricException{
        assertEquals(1,polyG.calculateArea(),0.1);
    }
}