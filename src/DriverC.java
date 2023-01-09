public class DriverC extends Driver<Car> {

    public DriverC(String fio, boolean driverLicense, int experience) {
        super(fio, driverLicense, experience);
    }
    public void startGo() {
        System.out.println("Водитель C начинает движение автомобиля C");
    }
}
