package L1.Interfaces;

import L1.Exceptions.*;

public interface GenericInterface <E> {
    boolean isElementAlreadyExists(E elementToAdd);
    void addElement(E elementToAdd, String letter) throws GeometricException;
    void removeElement(E elementToDelete);
}