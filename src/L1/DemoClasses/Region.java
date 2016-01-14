package L1.DemoClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

import L1.Interfaces.GenericInterface;
import L1.Exceptions.GeometricException;
import L1.Interfaces.DebugOutputStream;

class Region implements DebugOutputStream, GenericInterface {

    public final Map<Figure, String> figures;
    Figure previous;

    Region() {
        this.figures = new HashMap<>();
    }

    @Override
    public boolean isElementAlreadyExists(Object figureToAdd) {
        Iterator<Figure> regionItr = figures.keySet().iterator();
        while (regionItr.hasNext()) {
            if (figureToAdd.equals(regionItr.next())) return true;
        }
        return false;
    }

    @Override
    public void addElement(Object figureToAdd, String name) throws GeometricException {
        if (isElementAlreadyExists((Figure) figureToAdd) == true || 
            this.figures.containsValue(name)) {
            String exceptionMessage = "Figure with such name or coordinate set is already exists!";
            throw new GeometricException(exceptionMessage, (Figure) figureToAdd, name);
        }
        this.figures.put((Figure) figureToAdd, name);
    }

    @Override
    public void removeElement(Object figureToDelete) {
        Iterator<Figure> regionItr = figures.keySet().iterator();
        while (regionItr.hasNext()) {
            previous = regionItr.next();
            if (previous.equals(figureToDelete)) {
                figures.remove(previous);
                break;
            }
        }
    }
    
     @Override
    public String getInformation() {
        return " with " + figures.size() + " figures: " +  this.figures;
    }
    
    @Override
    public String knowMyself() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return this.knowMyself() + this.getInformation();
    }
}