public class  Transport {
    private String brand;
    private String model;
    private int year;
    private String contry;
    private String color;
    private int Speed;
    private float engineVolume;

    public Transport(String brand, String model, float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public  Transport(String brand, String model, int year, String contry, String color) {
        if (brand == null || brand == "") {
            this.brand = "deffualt";
        } else {
            this.brand = brand;
        }
        if (model == null || model == "") {
            this.model = "deffualt";
        } else {
            this.model = model;
        }
        if (year <= 1950 || year >=2023 ) {
            this.year = 2000;
        } else {
            this.year = year;
        }


        if (contry == null || contry == "") {
            this.contry = "deffualt";
        } else {
            this.contry = contry;
        }
        if (color == null || color == "") {
            this.color = "deffualt";
        } else {
            this.color = color;
        }
        this.Speed = Speed;
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
        return Speed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.Speed = maxSpeed;
    }

    public void start() {
        System.out.println("Начать движение");
    }

    public void stop() {
        System.out.println("Закончить двежение");
    }



    @Override
    public String toString() {
        return "BUs{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", contry='" + contry + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + Speed +
                '}';
    }

}
