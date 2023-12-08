public class Car1 {
    private String name;
    private String model;
    private int year;
    Car1(String carName, String model, int year) {
        this.setName(carName);
        this.setModel(model);
        this.setYear(year);
    }
    //Car1(Car1 car1) {
      //  this.copy(car1);
    //}
    Car1(Car1 car1) {
        this.copy(car1);
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
    public void copy(Car1 car1) {
        this.setName(car1.getName());
        this.setModel(car1.getModel());
        this.setYear(car1.getYear());
    }
    /*public void copy(Car1 car1) {
        this.setName(car1.getName());
        this.setModel(car1.getModel());
        this.setYear(car1.getYear());
    }*/
}
