package arrayExercice;

public class Array {
    public String name;
    public String email;
    public int roomsNumber;

    public Array(String name, String email, int roomsNumber) {
        this.name = name;
        this.email = email;
        this.roomsNumber = roomsNumber;
    }

    @Override
    public String toString() {
        return roomsNumber + ": " + name + ", " + email;
    }
}
