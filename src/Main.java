import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Car.Key key1 = new Car.Key(false, false);
//        Car.Key key2 = new Car.Key(true, true);
//        Car car1 = new Car("lada", "Grant", 1.7f, "желтый", 2015, "Россия","Ручная","Седан", "xa233x",5,false, key1);
//        System.out.println(car1.toString());
//        car1.changeTires(car1);
//        Car car2 = new Car("Audi", "A8 50L TDI quattro", 3.0f, "черный", 2020, "Германия","Автомат","Седан", "aa546x",5,false,key2);
//        System.out.println(car2.toString());
//        Car car3 = new Car("BMW", "Z8", 3.0f, "черный", 2021, "Германия","Ручная","Купе", "xa233x",2,false,key2);
//        System.out.println(car3.toString());
//        Car car4 = new Car("Kia", "Sportage 4", 2.4f, "красный", 2018, "Южная Корея","Автомат","Седан", "xa233x",5,false,key1);
//        System.out.println(car4.toString());
//        Car car5 = new Car("Hyundai", "Avante", 1.6f, "оранджевый", 2016, "Южная Корея","Автомат","Минивен", "aa233x",7,false,key1);
//        System.out.println(car5.toString());
//        Bus bus1 = new Bus("Mercedes", "Sprinter", 2002, "Germany", "yellow");
//        System.out.println(bus1.toString());
//        Bus bus2 = new Bus("WV", "polo", 2007, "Germany", "red");
//        System.out.println(bus2.toString());
//        Bus bus3 = new Bus("Mercedes", "Sprinter", 2009, "Germany", "White",150);
//        System.out.println(bus3.toString());


        Set<Mechanic> mechanics = new HashSet<>();
        Iterator<Mechanic> iterator = mechanics.iterator();
//         Map<Transport,Mechanic> mechanics = new HashMap<>();
        Mechanic mechanic1 = new Mechanic("Егор", "Mercdes", "легковой, трак");
        Passenger passenger1 = new Passenger("Audi", "TT", 5.0f, Passenger.BodyType.MINIVAN, mechanic1);
        Mechanic mechanic2 = new Mechanic("Макс", "BMW", "бусс");
        Bus bus1 = new Bus("Mercedes", "Sprinter", 3.0f,Bus.Capacity.SMALL ,mechanic2);
        Mechanic mechanic3 = new Mechanic("Владимир", "Ferrari", "легковой, трак");
        Truck truck1 = new Truck("Merceds", "Spriner", 3.0f, Truck.loadTonnage.TONNAGE_MIN2, mechanic3);
        mechanics.add(mechanic1);
        mechanics.add(mechanic3);
        mechanics.add(mechanic2);
        System.out.println(mechanic3);
        System.out.println(iterator);


        List<Transport> transport = new ArrayList<>();
        transport.add(bus1);
        transport.add(passenger1);
        transport.add(truck1);


        passenger1.start();
        passenger1.stop();
        truck1.start();
        truck1.stop();
        truck1.race("150");
//        DriverB<Passenger> alex = new DriverB<Passenger>("Alex", true, 2);
        DriverB alex = new DriverB("Alex", true, 5);
        DriverB crstian = new DriverB("Crstian", false, 3);
        alex.startGo();
        passenger1.printType();
        truck1.printType();
        passDiagnostics(truck1,passenger1,bus1);
        haveDriverLicense(alex,crstian);
        System.out.println(mechanics);

    }

    public static void passDiagnostics(Transport...transports) {
        for (Transport transport : transports) {
            try {
                transport.passDiagnostics();
            } catch (CantDiagnosticsException e) {
                System.out.println("Произошла ошибка");
                System.out.println(e.getMessage());
            }
        }

    }

    public static void haveDriverLicense(Driver...drivers) {
        for (Driver driver : drivers) {
            try {
                driver.haveDriverlicense();
            } catch (HeventDriverLicense e) {
                System.out.println("Произошла ошибка");
                System.out.println(e.getMessage());
            }
        }
    }


}