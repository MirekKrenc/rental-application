package pl.krencu.rentalapplication.domain.hotelroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HotelRoomFactory {
    public HotelRoom create(String hotelId, int number, String description, Map<String, Double> roomsDefinition) {

        List<SpaceInRoom> spaceInRooms = new ArrayList<>();
        roomsDefinition.forEach((name, size) -> spaceInRooms.add(new SpaceInRoom(name, new SquareMeter(size))));
        return new HotelRoom(hotelId, number, description, spaceInRooms);
    }
}
