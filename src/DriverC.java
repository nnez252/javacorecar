public class DriverC<L extends Transport & Competing> extends Driver {

    public DriverC(String fio, boolean driverLicense, int experience) {
        super(fio, driverLicense, experience);
    }
    public void startGo() {
        System.out.println("Водитель C начинает движение автомобиля C");
    }
}
