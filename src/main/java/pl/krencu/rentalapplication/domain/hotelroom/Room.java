package pl.krencu.rentalapplication.domain.hotelroom;

class Room {
    private final String name;
    private final SquareMeter squareMeter;

    Room(String name, SquareMeter squareMeter) {

        this.name = name;
        this.squareMeter = squareMeter;
    }
}
