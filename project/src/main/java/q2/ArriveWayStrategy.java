package q2;

import java.util.ArrayList;
import java.util.List;

public class ArriveWayStrategy {

    /**
     * From Wuhan to Beijing you can choose from 4 means of transportation, including driving a car, taking bus, train, or plane. Driving costs 500 yuan, bus 300 yuan, train 400 yuan, and plane 1000 yuan. With the budget of 500 yuan, which vehicles Xiaoming can choose to get there?
     */
    public static void main(String [] args) {
        List<String> ways = new ArrayList<>();
        double money = 500;
        List<Transportation> transportationList = new ArrayList<>();
        transportationList.add(new Transportation(500, "Car"));
        transportationList.add(new Transportation(300, "Bus"));
        transportationList.add(new Transportation(400, "Train"));
        transportationList.add(new Transportation(1000, "Plane"));
        for (Transportation t: transportationList) {
            if (t.price <= 500) {
                ways.add(t.name);
            }
        }
        System.out.println(ways.toString());
    }
}
