public class Mechanic {
    private String name;
    private String company;
    private Transport car;

    public Mechanic(String name, String company, Transport car) {
        this.name = name;
        this.company = company;
        this.car = car;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Transport getCar() {
        return car;
    }

    public void setCar(Transport car) {
        this.car = car;
    }

    public void passDiagnositcs() {
        System.out.println("Провожу диагностику автомобиля");
    }

    public void fixCar() {
        System.out.println("Чиню машину");
    }


}
