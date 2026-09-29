package jobsheet_w04;

public class Room {
    private String name;
    private final String code;
    private String type;
    private int capacity;
    private int currentOccupancy;

    public Room(String code, String name, String type, int capacity) {
        this.code = code;
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentOccupancy() {
        return currentOccupancy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isAvailable() {
        return currentOccupancy < capacity;
    }

    public void occupyBed() {
        if (isAvailable()) {
            currentOccupancy++;
        }
    }

    public void freeBed() {
        if (currentOccupancy > 0) {
            currentOccupancy--;
        }
    }
}
