package org.example;

public class Room {
    private RoomType roomType;

    public Room(RoomType roomType) {
        this.roomType = roomType;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }
}
