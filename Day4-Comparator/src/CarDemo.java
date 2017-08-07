import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by saifia on 8/2/2017.
 */
public class CarDemo {
    public static void main(String[] s) {

        Set<Car> names = new TreeSet<>();
        CarDemo d = new CarDemo();
        names = d.createTestData();
        Iterator<Car> itr = names.iterator();
        while (itr.hasNext()) {
            Car c = itr.next();
            System.out.println("car id:" + c.getId() + "Car price :" + c.getPrice() + "Car brand: " + c.getBrand());
        }

        Set<Car> carSet = createTestData(new CarIdComparator());
        itr = carSet.iterator();
        while (itr.hasNext()) {
            Car c = itr.next();
            System.out.println("Car id: " + c.getId() + " Price: " + c.getPrice() + " brand: " + c.getBrand());
        }

    }
    public static Set<Car> createTestData(){
        Car c1 = new Car(15, 300000, "Ford");
       Car c2 = new Car(16, 30, "Vols");
        Car c3 = new Car(17, 3000, "Mercedes");
        Car c4 = new Car(18, 30000, "Ferrari");
        Car c5 = new Car(19, 300, "Lambo");
        Set<Car> c = new TreeSet <>();
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);
        c.add(c5);
        return c;
    }
    public static Set<Car> createTestData(CarIdComparator carIdComparator){
        Car c1 = new Car(15, 300000, "Ford");
        Car c2 = new Car(16, 30, "Vols");
        Car c3 = new Car(17, 3000, "Mercedes");
        Car c4 = new Car(18, 30000, "Ferrari");
        Car c5 = new Car(19, 300, "Lambo");
        Set<Car> c = new TreeSet <>(carIdComparator);
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);
        c.add(c5);
        return c;
    }

}
