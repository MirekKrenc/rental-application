package pl.krencu.rentalapplication.domain.hotelroom;

import java.util.List;

public class HotelRoom {

    private final String hotelId;
    private final int number;
    private final String description;
    private final List<SpaceInRoom> spaceInRooms;

    public HotelRoom(String hotelId, int number, String description, List<SpaceInRoom> spaceInRooms) {

        this.hotelId = hotelId;
        this.number = number;
        this.description = description;
        this.spaceInRooms = spaceInRooms;
    }
}
