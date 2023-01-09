public class DriverD extends Driver<Car> {

    public DriverD(String fio, boolean driverLicense, int experience) {
        super(fio, driverLicense, experience);
    }
    public void startGo() {
        System.out.println("Водитель D начинает движение автомобиля D");
    }
}
