package pl.krencu.rentalapplication.domain.hotel;

public class HotelFactory {
    private String name;
    private String street;
    private String buildingNumber;
    private String postalCode;
    private String city;
    private String country;

    public Hotel create(String name, String street, String buildingNumber, String postalCode, String city, String country) {
        this.name = name;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;

        BuildingAddress buildingAddress = new BuildingAddress(street, buildingNumber, postalCode, city, country);
        return new Hotel(name, buildingAddress);
    }
}
