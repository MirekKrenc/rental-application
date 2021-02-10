package pl.krencu.rentalapplication.domain.hotel;

class BuildingAddress {
    private final String street;
    private final String buildingNumber;
    private final String postalCode;
    private final String city;
    private final String country;

    BuildingAddress(String street, String buildingNumber, String postalCode, String city, String country) {

        this.street = street;
        this.buildingNumber = buildingNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }
}
