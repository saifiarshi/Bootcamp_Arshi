/**
 * Created by saifia on 8/2/2017.
 */
public class Car implements Comparable{
    int id;
    double price;
    String brand;

    public Car(int id, double price, String brand) {
        this.id = id;
        this.price = price;
        this.brand = brand;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    @Override
    public int compareTo(Object o) {
        Car c=(Car)o;
        if(this.price==c.price)
            return 0;
        else if(this.price>c.price)
            return 1;
        else return -1;
    }
}
