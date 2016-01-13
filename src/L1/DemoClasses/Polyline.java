package L1.DemoClasses;

import java.util.Iterator;
import java.util.LinkedHashMap;
import L1.Interfaces.*;
import L1.Exceptions.*;

class Polyline extends Figure implements GenericInterface {
    final LinkedHashMap<Point, String> points;
    Point first;
    Point last;
    Point previous;
    Point next;

    Polyline() {
        super();
        this.points = new LinkedHashMap<>();
    }

    @Override
    public boolean isElementAlreadyExists(Object pointToAdd) {
        Iterator<Point> polylineItr = points.keySet().iterator();
        while (polylineItr.hasNext()) {
            if (pointToAdd.equals(polylineItr.next())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addElement(Object pointToAdd, String letter) throws GeometricException {
        if (isElementAlreadyExists(pointToAdd) == true || this.points.containsValue(letter)) {
            String exceptionMessage = "Point with such name or coordinates is already exists!";
            throw new GeometricException(exceptionMessage, (Point) pointToAdd, letter);
        }
        this.points.put((Point) pointToAdd, letter);
    }

    @Override
    public void removeElement(Object pointToDelete) {
        Iterator<Point> polylineItr = points.keySet().iterator();
        while (polylineItr.hasNext()) {
            previous = polylineItr.next();
            if (previous.equals(pointToDelete)) {
                points.remove(previous);
                break;
            }
        }
    }

    @Override
    double calculatePerimeter() {
        double perimeter = 0;
        Iterator<Point> polylineItr = points.keySet().iterator();

        previous = polylineItr.next();
        first = previous;

        while (polylineItr.hasNext()) {
            next = polylineItr.next();
            perimeter += previous.findDistanceToAnotherPoint(next);
            previous = next;
            if (!polylineItr.hasNext()) {
                last = next;
            }
        }

        return perimeter;
    }

    @Override
    double calculateArea() throws GeometricException {
        String exceptionMessage = "Polyline has no area!";
        throw new GeometricException(exceptionMessage);
    }

    @Override
    public String getInformation() {
        return " with " + points.size() + " points: " + points;
    }
}