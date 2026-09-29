package jobsheet_w04;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private final String name;
    private final String address;
    private final String phoneNumber;
    private final List<Room> listRoom;
    private final List<Doctor> listDoctor;

    public Hospital(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.listRoom = new ArrayList<>();
        this.listDoctor = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Doctor> getListDoctor() {
        return listDoctor;
    }

    public List<Room> getListRoom() {
        return listRoom;
    }

    public void createRoom(String name, String type, int capacity) {
        Room entity;
        if (!listRoom.isEmpty()) {
            Room value = listRoom.getLast();

            String code = value.getCode();

            String[] parts = code.split("-");
            String prefix = parts[0];
            String numberStr = parts[1];

            int number = Integer.parseInt(numberStr);
            number++;

            String codeEntity = prefix + "-" + String.format("%03d", number);
            entity = new Room(codeEntity, name, type, capacity);
        } else {
            entity = new Room("R-001", name, type, capacity);
        }
        System.out.println("Add Room Code: " + entity.getCode());
        listRoom.add(entity);
    }

    public Room findRoomByCode(String code) {
        List<Room> findEntity = listRoom.stream().filter(f -> f.getCode().equals(code)).toList();
        return findEntity.isEmpty() ? null : findEntity.getFirst();
    }

    public void addDoctor(Doctor value) {
        this.listDoctor.add(value);
        System.out.println("Add Doctor code: "+ value.getCode());
    }

    public int getTotalBedCapacity() {
        return listRoom.stream().mapToInt(Room::getCapacity).sum();
    }
}
