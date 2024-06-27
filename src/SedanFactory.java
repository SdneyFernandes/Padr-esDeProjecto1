public class SedanFactory implements CarFactory{
    @Override
    public Car createCar(String model, String color, String year) {
        return new Sedan(model, color, year);
    }
}
