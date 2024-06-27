public class Sedan implements Car {
    private String model;
    private String color;
    private String year;


    public Sedan(String model, String color, String year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getYear() {
        return year;
    }
}
