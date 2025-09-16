public class Main {
    public static void main(String[] args) {
        Ship titanic = new Ship(15, 20);
        System.out.println(titanic.isWorthIt());

        Ship blackPearl = new Ship(50, 5);
        System.out.println(blackPearl.isWorthIt());
    }
}