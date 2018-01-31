package myproject.week3.model;

public class Room {
    private String roomId;
    private int floor;
    private double roomArea;

    public Room() {
    }

    public Room(String roomId, int floor, double roomArea) {
        this.roomId = roomId;
        this.floor = floor;
        this.roomArea = roomArea;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(double roomArea) {
        this.roomArea = roomArea;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId='" + roomId + '\'' +
                ", floor='" + floor + '\'' +
                ", roomArea=" + roomArea +
                '}';
    }
}
