package L1.MainPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

class Region implements GenericInterface{
    public final Map <Figure, String> figures;
    Figure previous;
    
    Region(){
        this.figures = new HashMap <>();
    }
    
    @Override
    public boolean isElementAlreadyExists (Object figureToAdd){
        Iterator<Figure> regionItr = figures.keySet().iterator();
        while (regionItr.hasNext()) {
            if(figureToAdd.equals(regionItr.next()))
                return true;
        }
        return false;
    }
    
    @Override
    public void addElement(Object figureToAdd, String letter) throws GeometricException {
        if(isElementAlreadyExists((Figure)figureToAdd)==true || this.figures.containsValue(letter)) {
                String exceptionMessage = "Point with such name or coordinates is already exists!";
                throw new GeometricException(exceptionMessage, (Figure)figureToAdd, letter);
            }
            this.figures.put((Figure)figureToAdd, letter);
        }

    @Override
    public void removeElement(Object pointToDelete) {
        Iterator<Figure> polylineItr = figures.keySet().iterator();
        while (polylineItr.hasNext()) {
            previous = polylineItr.next();
            if (previous.equals(pointToDelete)) {
                figures.remove(previous);
                break;
            }
        }
    }       
}