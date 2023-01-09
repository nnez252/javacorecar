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
//        Bus bus3 = new Bus("Mercedes", "Sprinter", 2009, "Germany", "White");
//        System.out.println(bus3.toString());

        Passenger passenger = new Passenger("Audi", "TT", 5.0f);
        passenger.start();
        passenger.stop();
        Truck truck = new Truck("Merceds", "Spriner", 3.0f);
        truck.start();
        truck.stop();
        truck.race("150");
//        DriverB<Passenger> alex = new DriverB<Passenger>("Alex", true, 2);
        DriverB alex = new DriverB("Alex", true, 5);
        alex.startGo();
    }
}