package org.example;

public enum Element {
    H("Hydrogen", 1),
    O("Oxygen", 8);

    String elementName;
    int atomicNumber;

    Element(String elementName, int atomicNumber) {
        this.elementName = elementName;
        this.atomicNumber = atomicNumber;
    }

    public String getElementName() {
        return elementName;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }
}
