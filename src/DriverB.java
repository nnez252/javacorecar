public class DriverB<T extends Transport & Competing> extends Driver {

    public DriverB(String fio, boolean driverLicense, int experience) {
        super(fio, driverLicense, experience);
    }
    public void startGo() {
        System.out.println("Водитель B начинает движение автомобиля B");
    }
}
