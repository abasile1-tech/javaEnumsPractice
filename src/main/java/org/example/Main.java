package org.example;

public class Main {
    public static void main(String[] args) {
        Room room = new Room(RoomType.DOUBLEDOUBLE);

        System.out.println(room.getRoomType().getCapacity());
    }
}