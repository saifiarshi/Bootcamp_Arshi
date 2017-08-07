import java.util.Comparator;

/**
 * Created by saifia on 8/2/2017.
 */
public class CarIdComparator implements Comparator<Car> {

    @Override
        public int compare(Car c1, Car c2){
            return c1.getId()-c2.getId();
        }
    }
