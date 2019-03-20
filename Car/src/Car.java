import java.util.ArrayList;
import java.util.Scanner;

public class Car {

    static int instanceCarId = 0;
    int carId = 0;

    public Car() {
        instanceCarId++;
        carId = instanceCarId;
    }

    public String toString() {
        return String.format("%s, ", carId);
    }

    public static ArrayList<Car> makeCars(int antal) {
        final int max = 50;

        ArrayList<Car> carlist = new ArrayList<Car>();

        for (int i = 1; i <= antal; i++) {
            if (antal <= max) {
                carlist.add(new Car());
            }
            else {
                break;
            }

        }
        return carlist;


    }
}
