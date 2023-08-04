// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Bike motogp = new Bike();
        motogp.changeSpeed(1000);
        motogp.gearChange(5);
        motogp.printStates();

        Car ferrari = new Car(6, 2000);
        ferrari.changeSpeed(200);
        ferrari.gearChange(6);
        ferrari.printStates();
    }
}

