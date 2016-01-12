package L1.Exceptions;

import L1.DemoClasses.*;

public class GeometricException extends Exception{
    private Point wrongPoint;
    private String wrongLetter;
    private Figure wrongFigure;
    private String wrongFigureName;
    
   public GeometricException(String addFigureEx, Figure wrong, String name){
        super(addFigureEx);
        this.wrongFigure = wrong;
        this.wrongFigureName = name;
    }    
    
    public GeometricException(String addPointEx, Point wrong, String letter){
        super(addPointEx);
        this.wrongPoint = wrong;
        this.wrongLetter = letter;
    }
    
    public GeometricException(String calculationEx){
        super(calculationEx);
    }
    
    public GeometricException(String segmentNameLengthEx, String transferredName, Integer length){
        super(segmentNameLengthEx+": "+transferredName+" length is "+length.toString());
    }
    
    public void getWrongParameters(){
        System.err.println(this.wrongLetter+this.wrongPoint.getInformation());
    }
}
