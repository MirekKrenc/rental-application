package pl.krencu.rentalapplication.application.apartment;

import pl.krencu.rentalapplication.domain.apartment.Apartment;
import pl.krencu.rentalapplication.domain.apartment.Room;
import pl.krencu.rentalapplication.domain.apartment.Address;
import pl.krencu.rentalapplication.domain.apartment.SquareMeter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApartmentApplicationService {

    public void add(String ownerId, String street, String postalCode, String houseNumber,
                    String apartmentNumber, String city, String country, String description,
                    Map<String, Double> roomsDefinition) {

        Address address = new Address(street, postalCode, houseNumber, apartmentNumber, city, country);
        List<Room> rooms = new ArrayList<>();
        roomsDefinition.forEach((name, size) -> rooms.add(new Room(name, new SquareMeter(size))));

        Apartment apartment = new Apartment(ownerId, address, description);
    }
}
