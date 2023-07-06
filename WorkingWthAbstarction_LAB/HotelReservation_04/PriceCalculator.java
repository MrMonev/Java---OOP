package WorkingWthAbstarction_LAB.HotelReservation_04;

public class PriceCalculator {

    private double pricePerDay;
    private int days;
    private Seasons seasons;
    private DiscountType discountType;

    public PriceCalculator(double pricePerDay, int days, Seasons seasons, DiscountType discountType) {
        this.pricePerDay = pricePerDay;
        this.days = days;
        this.seasons = seasons;
        this.discountType = discountType;
    }
    public double calculate() {
       return
               this.pricePerDay *
               this.days * this.seasons.getPriceFactor() *
               this.discountType.getDiscountFactor();
    }
}
