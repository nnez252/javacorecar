import java.util.Objects;

public class Truck<C extends DriverC> extends Transport implements Competing {

    public enum loadTonnage {
        TONNAGE_MAX1(3.5f),
        TONNAGE_MIN2(3.5f),
        TONNAGE_MAX2(12f),
        TONNAGE_MAX3(12f);
        private float tonnage;

        loadTonnage(float tonnage) {
            this.tonnage = tonnage;
        }

        @Override
        public String toString() {
            return "Грузоподьемность " +
                     tonnage +
                    'т';
        }
    }

    public static final String PIT_STOP = "Пистстоп";
    public static final String SPEED_1 = "150";
    public static final String SPEED_2 = "160";
    public static final String SPEED_3 = "163";
    public static final String TIME_1 = "2";
    public static final String TIME_2 = "1:56";
    public static final String TIME_3 = "1:55";
    public static final String[] SPEED = {SPEED_1, SPEED_2, SPEED_3};
    public static final String[] TIME = {TIME_1, TIME_2, TIME_3};
    private String gear;
    private boolean turbine;
    private int wghite;
    private int numberOfGear;
    private loadTonnage type;


    public Truck(String brand, String model, float engineVolume, loadTonnage type) {
        super(brand, model, engineVolume);
        this.type = type;

    }

    public loadTonnage getType() {
        return type;
    }

    public void setType(loadTonnage type) {
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

    @Override
    public void race(String race) {
        System.out.println("1 круг " + race);
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
        Truck<?> truck = (Truck<?>) o;
        return turbine == truck.turbine && wghite == truck.wghite && numberOfGear == truck.numberOfGear && Objects.equals(gear, truck.gear) && type == truck.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), gear, turbine, wghite, numberOfGear, type);
    }
}
