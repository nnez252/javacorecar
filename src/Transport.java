import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Transport {
    private String brand;

    private String model;
    private int year;
    private String contry;
    private String color;
    private int speed;
    private float engineVolume;
    private String mechanic;
    private List<Mechanic> mechanics = new ArrayList<>();



    public Transport(String brand, String model, float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public Transport(String brand, String model, int year, String contry, String color) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "deffualt";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "deffualt";
        } else {
            this.model = model;
        }
        if (year <= 1950 || year >= 2023) {
            this.year = 2000;
        } else {
            this.year = year;
        }


        if (contry == null || contry.isEmpty()) {
            this.contry = "deffualt";
        } else {
            this.contry = contry;
        }
        if (color == null || color.isEmpty()) {
            this.color = "deffualt";
        } else {
            this.color = color;
        }
        this.speed = speed;
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getContry() {
        return contry;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.speed = maxSpeed;
    }

    public void start() {
        System.out.println("Начать движение");
    }

    public void stop() {
        System.out.println("Закончить двежение");
    }

    public String getMechanic() { return mechanic; }

    public void setMechanic(String mechanic) { this.mechanic = mechanic; }

    public String printType() {

        return null;
    }


    public void addMechanic(Mechanic m) {
        this.mechanics.add(m);
    }
    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    @Override
    public String toString() {
        return "BUs{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", contry='" + contry + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + speed +
                '}';
    }

    public void passDiagnostics() throws CantDiagnosticsException{
        System.out.println(getBrand()+"Проходит диагностику");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return year == transport.year && speed == transport.speed && Float.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(contry, transport.contry) && Objects.equals(color, transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, contry, color, speed, engineVolume);
    }

}
