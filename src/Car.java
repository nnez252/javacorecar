public class Car extends Transport {
    private float engineVolume;
    private String color;
    private String gear;
    private final String bodyType;
    private String regNumber;
    private final int placeSeat;
    private boolean summerTires;
    private Key key;

    public Car(String brand, String model, float engineVolume, String color, int year, String contry, String gear, String bodyType, String regNumber, int placeSeat, boolean summerTires, Key key) {
        super(brand,model,year,contry,color);
        this.engineVolume = engineVolume;
        this.gear = gear;
        this.bodyType = bodyType;
        if (regNumber == regNumber.substring(0, 6)) {
            this.regNumber = regNumber;
        } else {
            this.regNumber = "deffualt";
        }
        this.placeSeat = placeSeat;
        this.summerTires = summerTires;
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
    }


    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }


    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public int getPlaceSeat() {
        return placeSeat;
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + getColor() + '\'' +
                ", yers=" + getYear() +
                ", contry='" + getContry() + '\'' +
                ", gear='" + gear + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", placeSeat=" + placeSeat +
                ", summerTires=" + summerTires +
                ", key=" + getKey() +
                '}';
    }

    public void changeTires(Car car1) {
        summerTires = !summerTires;
    }

    public static class Key {
        private final boolean remoteRunEngine;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteRunEngine, boolean withoutKeyAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.withoutKeyAccess = withoutKeyAccess;
        }
        public Key() {
            this(false, false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }
    }

}