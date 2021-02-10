package pl.krencu.rentalapplication.domain.hotel;

public class Hotel {

    private final String name;
    private final BuildingAddress buildingAddress;

    public Hotel(String name, BuildingAddress buildingAddress) {

        this.name = name;
        this.buildingAddress = buildingAddress;
    }
}
