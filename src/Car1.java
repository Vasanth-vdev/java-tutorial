public class Car1 {
    private String name;
    private String model;
    private int year;
    Car1(String carName, String model, int year) {
        this.setName(carName);
        this.setModel(model);
        this.setYear(year);
    }
    public String getName() {
        return name;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
