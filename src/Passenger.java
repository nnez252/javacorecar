public class Passenger<B extends DriverB> extends  Transport implements Competing{

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
    public Passenger(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
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
}
