public class SUVFactory implements CarFactory{

    @Override
    public Car createCar(String model, String color, String year) {
        return new SUV(model, color, year);
    }
}
