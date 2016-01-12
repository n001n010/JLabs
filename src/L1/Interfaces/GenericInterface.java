package L1.Interfaces;

import L1.Exceptions.GeometricException;

public interface GenericInterface<E> {
    boolean isElementAlreadyExists(E elementToAdd);
    void addElement(E elementToAdd, String letter) throws GeometricException;
    void removeElement(E elementToDelete);
}