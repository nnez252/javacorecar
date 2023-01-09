public class Driver <T extends Transport & Competing>  {
    private String fio;
    private boolean driverLicense;
    private int experience;

    public Driver(String fio, boolean driverLicense, int experience) {
        this.fio = fio;
        this.driverLicense = driverLicense;
        this.experience = experience;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void start() {
        System.out.println("начать движение");
    }

    public void stop() {
        System.out.println("остановиться");
    }

    public void refuel() {
        System.out.println("Заправиться");
    }
    public void startGo() {
        System.out.println("Водитель B начинает движение автомобиля B");
    }


}
