package org.example;

public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    DOUBLEDOUBLE(4),
    TWIN(2);

    private final int capacity;

    RoomType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
