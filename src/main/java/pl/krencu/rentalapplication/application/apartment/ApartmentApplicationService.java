package pl.krencu.rentalapplication.application.apartment;

import pl.krencu.rentalapplication.domain.apartment.Apartment;
import pl.krencu.rentalapplication.domain.apartment.ApartmentFactory;

import java.util.Map;

public class ApartmentApplicationService {

    public void add(String ownerId, String street, String postalCode, String houseNumber,
                    String apartmentNumber, String city, String country, String description,
                    Map<String, Double> roomsDefinition) {

        final Apartment apartment =  new ApartmentFactory().create(ownerId, street, postalCode, houseNumber, apartmentNumber, city, country, description, roomsDefinition);
    }

}
