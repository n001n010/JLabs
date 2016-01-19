package L1.GroupTests;

import L1.DemoClasses.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(value={PointTest.class,
                           CircleTest.class,
                           SegmentTest.class,
                           PolylineTest.class,
                           PolygonTest.class})

public class AllFiguresTest {
    
}