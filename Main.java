import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota Camry", 2015));
        cars.add(new Car("Honda Accord", 2018));
        cars.add(new Car("Ford Mustang", 2013));
        cars.add(new Car("Chevrolet Malibu", 2019));
        cars.add(new Car("Tesla Model 3", 2020));
        cars.add(new Car("BMW 3 Series", 2017));
        cars.add(new Car("Audi A4", 2016));
        cars.add(new Car("Mercedes-Benz C-Class", 2014));
        cars.add(new Car("Volkswagen Passat", 2021));
        cars.add(new Car("Mazda 6", 2012));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("\nTask 2");

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(1, "Laptop"));
        items.add(new Item(2, "Smartphone"));
        items.add(new Item(3, "Tablet"));
        items.add(new Item(4, "Monitor"));
        items.add(new Item(5, "Keyboard"));

        for (int i = 0; i < items.size(); i++) {
            items.get(i).show();
        }

        HashMap<Integer, String> itemsMap = new HashMap<>();
        for (Item item : items) {
            itemsMap.put(item.getId(), item.getName());
        }

        for (Map.Entry<Integer, String> entry : itemsMap.entrySet()) {
            System.out.println("Item ID: " + entry.getKey() + ", Item Name: " + entry.getValue());
        }
        System.out.println("\nTask 3");
        ArrayList<Item2> items = new ArrayList<>();
        items.add(new Item2(1, "Laptop"));
        items.add(new Item2(2, "Smartphone"));
        items.add(new Item2(3, "Tablet"));
        items.add(new Item2(4, "Monitor"));
        items.add(new Item2(5, "Keyboard"));
        items.add(new Item2(6, "Mouse"));
        items.add(new Item2(7, "Printer"));
        items.add(new Item2(8, "Webcam"));
        items.add(new Item2(9, "Headphones"));
        items.add(new Item2(10, "Speakers"));

        List<Item2> firstFiveItems = items.subList(0, 5);
        HashSet<Item2> itemSet = new HashSet<>(firstFiveItems);
        for (Item2 item : itemSet) {
            System.out.println(item);
        }
    }
}
