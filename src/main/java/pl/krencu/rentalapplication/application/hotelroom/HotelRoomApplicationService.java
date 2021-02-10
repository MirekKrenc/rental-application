package pl.krencu.rentalapplication.application.hotelroom;

import pl.krencu.rentalapplication.domain.hotelroom.HotelRoom;
import pl.krencu.rentalapplication.domain.hotelroom.HotelRoomFactory;

import java.util.Map;

public class HotelRoomApplicationService {

    public void add(String hotelId, int number, String description, Map<String, Double> spacesDefinition) {

        HotelRoom hotelRoom = new HotelRoomFactory().create(hotelId, number, description, spacesDefinition);
    }

}
