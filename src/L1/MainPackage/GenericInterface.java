package L1.MainPackage;

interface GenericInterface <E> {
    boolean isElementAlreadyExists(E elementToAdd);
    void addElement(E elementToAdd, String letter) throws GeometricException;
    void removeElement(E elementToDelete);
}