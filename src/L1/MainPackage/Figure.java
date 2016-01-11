
package L1.MainPackage;

abstract public class Figure implements MainInterface{
    String htmlСolor;
    Double mmLineWeight;
    
    static String htmlColorDefault = "white";
    static Double mmLineWeightDefault = 0.5;

    Figure()
    {
        this.htmlСolor = htmlColorDefault;
        this.mmLineWeight = mmLineWeightDefault;
    }
            
    abstract double calculatePerimeter() throws GeometricException;
    abstract double calculateArea() throws GeometricException;
         
    @Override
    public String knowMyself()
    {
        return this.getClass().getSimpleName();
    }
    
    @Override
    public String toString() {
       return this.knowMyself() + getInformation();
    }
}