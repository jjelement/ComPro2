package sorrawich.week3.model;

public class Building {
    private String name;
    private Address address;
    private Room[] rooms;

    public Building() {
        this("unknown", null);
    }

    public Building(String name, Address address) {
        this.name = name;
        this.address = address;
        this.createRoomInBuilding();
    }

    public void createRoomInBuilding() {
        this.rooms = new Room[100];
        for(int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room("room" + (i+1), (i+1), (i+1)*100);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        String result = String.format("Name: %s\nAddress: %s\n", this.name, this.address);

        for (int i = 0; i < this.rooms.length; i++) {
            result += this.rooms[i];
        }
        return result;
    }
}
