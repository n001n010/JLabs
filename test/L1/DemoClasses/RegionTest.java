package L1.DemoClasses;

import L1.Exceptions.GeometricException;
import static java.lang.System.out;
import org.junit.Test;

public class RegionTest {
    
    private final Region reg = new Region();
    
    private final Polygon abc = new Polygon();
    private final Circle o = new Circle(new Point(0,0),2);
      
    @Test
    public void testRegionAllInOneMagicMetod() throws GeometricException {
        
        abc.addElement(new Point(0,0), "A");
        abc.addElement(new Point(1,1), "B");
        abc.addElement(new Point(-1,2), "C");

        reg.addElement(abc, "ABC");
        reg.addElement(o, "O");
        
        out.println(reg + ".");
    }
}