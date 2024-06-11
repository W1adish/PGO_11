import java.util.ArrayList;
import java.util.Collections;
class Car implements Comparable<Car> {
    private String name;
    private int yearOfProduction;

    public Car(String name, int yearOfProduction) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
    }

    public String getName() {
        return name;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int compareTo(Car other) {
        return Integer.compare(this.yearOfProduction, other.yearOfProduction);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + name + '\'' +
                ", year=" + yearOfProduction +
                '}';
    }

}







