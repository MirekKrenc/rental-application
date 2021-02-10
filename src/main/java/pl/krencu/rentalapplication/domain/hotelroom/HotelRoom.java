package pl.krencu.rentalapplication.domain.hotelroom;

import java.util.List;

public class HotelRoom {

    private final String hotelId;
    private final int number;
    private final String description;
    private final List<Room> rooms;

    public HotelRoom(String hotelId, int number, String description, List<Room> rooms) {

        this.hotelId = hotelId;
        this.number = number;
        this.description = description;
        this.rooms = rooms;
    }
}
