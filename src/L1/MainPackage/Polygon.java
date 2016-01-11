package L1.MainPackage;

import java.util.Iterator;

public class Polygon extends Polyline {
    
    Polygon()
    {
        super();
    }
        
    private String figuringOut(Integer anglesAmount) throws GeometricException {
        
        if(anglesAmount<3)
        {
            String exceptionMessage = "Yet not a polygon! Not enough angles: "+anglesAmount;
            throw new GeometricException(exceptionMessage);
        }
        
        switch (anglesAmount) {
            case 3: return (" [Triangle]");
            case 4: return (" [Tetragon]");
            case 10: return (" [Hellofagon]");
        }
        return "";
    }
   
    @Override
    double calculateArea() {

        double area = 0;
        
        Iterator<Point> polygonItr = points.keySet().iterator();   
        
        previous = polygonItr.next();
        first = previous;
        
        while (polygonItr.hasNext()) {
            next = polygonItr.next();
            area += ((previous.xAxisPosition+next.xAxisPosition) * 
                     (previous.yAxisPosition-next.yAxisPosition));
            previous = next;
            
            if(!polygonItr.hasNext())
            area += ((previous.xAxisPosition+first.xAxisPosition) * 
                     (previous.yAxisPosition-first.yAxisPosition));
        }
        
        if (area<0) area*=-1;
        
        return 0.5 * area;
    }

    @Override
    public String getInformation() {
        try{
            return figuringOut(this.points.size())+" with " +
                   points.size()+" points: "+points.toString();
        }
        catch(GeometricException e)
        {
            e.printStackTrace();
        }
        return " exception at getInformation()";
    }
}