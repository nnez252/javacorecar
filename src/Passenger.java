import java.util.Objects;

public class Passenger<B extends DriverB> extends  Transport implements Competing{

    public enum BodyType {
        SEDAN("Седан"),
        HETСHBACK("Хечбэк"),
        COUPE("Купе"),
        UNIVERSAL("универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");
        private String name;

        BodyType(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Тип кузова " +
                    name + '\'';
        }
    }

    public static final String PIT_STOP = "Пистстоп";
    public static final String SPEED_1 = "220";
    public static final String SPEED_2 = "225";
    public static final String SPEED_3 = "230";
    public static final String TIME_1 = "1:36";
    public static final String TIME_2 = "1:35";
    public static final String TIME_3 = "1:34";
    public static final String[] SPEED = {SPEED_1, SPEED_2, SPEED_3};
    public static final String[] TIME = {TIME_1, TIME_2, TIME_3};
    private String gear;
    private boolean turbine;
    private int wghite;
    private int numberOfGear;
    private BodyType type;

    public Passenger(String brand, String model, float engineVolume, BodyType type) {
        super(brand, model, engineVolume);
        this.type = type;

    }

    public BodyType getType() {
        return type;
    }

    public void setType(BodyType type) {
        this.type = type;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public boolean isTurbine() {
        return turbine;
    }

    public void setTurbine(boolean turbine) {
        this.turbine = turbine;
    }

    public int getWghite() {
        return wghite;
    }

    public void setWghite(int wghite) {
        this.wghite = wghite;
    }

    public int getNumberOfGear() {
        return numberOfGear;
    }

    public void setNumberOfGear(int numberOfGear) {
        this.numberOfGear = numberOfGear;
    }

    @Override
    public String pitStop() {
        return PIT_STOP;
    }

    @Override
    public String[] getBestTime() {
        return TIME;
    }

    @Override
    public String[] getMaxSpeed() {
        return SPEED;
    }
    public void race(String race) {
        System.out.println("1 круг" + race);
        switch (race) {
            case SPEED_1:
                System.out.println("Скорость за первый круг");
                break;
            case  TIME_1:
                System.out.println("Время за первый круг ");
                break;
            case PIT_STOP:
                System.out.println("Питстов совершен в 1:20");
                break;
            case SPEED_2:
                System.out.println("Скорость за 2 круг");
                break;
            case  TIME_2:
                System.out.println("Время за 2 круг ");
                System.out.println("Питстов совершен в 1:10");
                break;
            case SPEED_3:
                System.out.println("Скорость за 3 круг");
                break;
            case  TIME_3:
                System.out.println("Время за 3 круг ");
                System.out.println("Питстов совершен в 1:01");
                break;
            default:
                System.out.println("ошибка");
        }
    }
    @Override
    public String printType() {
        super.printType();
        if (getType() == null) {
            System.out.println("Кузов не известен");
        } else {
            System.out.println(getType());
        }
        return String.valueOf(getType());
    }

    @Override
    public void passDiagnostics() throws CantDiagnosticsException {
        super.passDiagnostics();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Passenger<?> passenger = (Passenger<?>) o;
        return turbine == passenger.turbine && wghite == passenger.wghite && numberOfGear == passenger.numberOfGear && Objects.equals(gear, passenger.gear) && type == passenger.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), gear, turbine, wghite, numberOfGear, type);
    }
}

