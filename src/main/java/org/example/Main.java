package org.example;

public class Main {
    public static void main(String[] args) {
        Room room = new Room(RoomType.DOUBLE);

        System.out.println(room.getRoomType());
    }
}