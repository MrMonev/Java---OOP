package WorkingWthAbstarction_LAB.HotelReservation_04;

public enum Seasons {

    Autumn(1),
    Spring(2),
    Winter(3),
    Summer(4);

    private int priceFactor;

    Seasons(int priceFactor) {
        this.priceFactor = priceFactor;
    }

    public int getPriceFactor() {
        return priceFactor;
    }
}
