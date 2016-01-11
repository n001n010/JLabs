package L1.MainPackage;

class GeometricException extends Exception{
    private Point wrongPoint;
    private String wrongLetter;
    private Figure wrongFigure;
    private String wrongFigureName;
    
   GeometricException(String addFigureEx, Figure wrong, String name){
        super(addFigureEx);
        this.wrongFigure = wrong;
        this.wrongFigureName = name;
    }    
    
    GeometricException(String addPointEx, Point wrong, String letter){
        super(addPointEx);
        this.wrongPoint = wrong;
        this.wrongLetter = letter;
    }
    
    GeometricException(String calculationEx){
        super(calculationEx);
    }
    
    GeometricException(String segmentNameLengthEx, String transferredName, Integer length){
        super(segmentNameLengthEx+": "+transferredName+" length is "+length.toString());
    }
    
    void getWrongParameters(){
        System.err.println(this.wrongLetter+this.wrongPoint.getInformation());
    }
}
