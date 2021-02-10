package pl.krencu.rentalapplication.domain.hotelroom;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HotelRoomFactory {
    public HotelRoom create(String hotelId, int number, String description, Map<String, Double> roomsDefinition) {

        List<SpaceInRoom> spaceInRooms = roomsDefinition
                .entrySet()
                .stream()
                .map(entry -> {
                    SquareMeter squareMeter = new SquareMeter(entry.getValue());
                    return new SpaceInRoom(entry.getKey(), squareMeter);
                })
                .collect(Collectors.toList());


        return new HotelRoom(hotelId, number, description, spaceInRooms);
    }
}
