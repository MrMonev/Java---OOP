package InterfacesAndAbstraction_Lab.CarShopExtended_02;

public class Main {
    private static final String CAR_DEFAULT_PATTERN =
            "%s is %s color and have %s horse power";

        public static void main(String[] args) {
            Sellable seat = new Seat("Leon", "Gray", 110, "Spain", 11111.1);
            Rentable audi = new Audi("A4", "Gray", 110, "Germany", 3, 99.9);

            System.out.println(seat);
            System.out.println(audi);


    }
}
