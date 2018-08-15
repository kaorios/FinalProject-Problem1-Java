public class Main {

    public static void main(String[] args) {
        Place place = new Place(new int[]{2,6,6,3});
        int castles = place.getNumberOfCastle();

        if (castles > 0) {
            System.out.println(castles + " of castle(s) are built.");
        } else {
            System.out.println("There is no space");
        }
    }
}
