public class DriverD<V extends Transport & Competing> extends Driver {

    public DriverD(String fio, boolean driverLicense, int experience) {
        super(fio, driverLicense, experience);
    }
    public void startGo() {
        System.out.println("Водитель D начинает движение автомобиля D");
    }
}
