package pl.krencu.rentalapplication.domain.hotelroom;

class SpaceInRoom {
    private final String name;
    private final SquareMeter squareMeter;

    SpaceInRoom(String name, SquareMeter squareMeter) {

        this.name = name;
        this.squareMeter = squareMeter;
    }
}
