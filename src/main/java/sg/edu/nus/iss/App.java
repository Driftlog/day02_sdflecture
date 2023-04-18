package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        MountainBike mountainBike = new MountainBike(5,10, 20);
        System.out.println(mountainBike);

        List<Bicycle> bicycles = new ArrayList<Bicycle>();

        bicycles.add(mountainBike);

        /**  for (MountainBike mountainBikes : bicycles) {
            System.out.println(mountainBikes);
        } */

        System.out.println(bicycles.toString());

        for (Bicycle bicycle : bicycles) {
            if (bicycle instanceof MountainBike) {
                System.out.println(bicycle.hashCode() + " is a MountainBike");
            } else if (bicycle instanceof RoadBike) {
                System.out.println(bicycle.hashCode() + "is a RoadBike");
            }
        }
    }
}
