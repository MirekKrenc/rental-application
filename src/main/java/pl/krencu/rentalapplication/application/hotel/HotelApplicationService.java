package pl.krencu.rentalapplication.application.hotel;

import pl.krencu.rentalapplication.domain.hotel.Hotel;
import pl.krencu.rentalapplication.domain.hotel.HotelFactory;

class HotelApplicationService {

    public void add(String name, String street, String buildingNumber, String postalCode, String city, String country) {

        final Hotel hotel = new HotelFactory().create(name, street, buildingNumber, postalCode, city, country);

    }
}
