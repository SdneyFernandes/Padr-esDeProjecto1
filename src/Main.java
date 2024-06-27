//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarFactory suvFactory = new SUVFactory();
        Car suv = suvFactory.createCar("CR-V", "Vermelha", "2022");
        System.out.print("Criado um " + suv.getModel() + " da cor " + suv.getColor() + "do ano " + suv.getYear());

        CarFactory sedanFactory = new SedanFactory();
        Car sedan = sedanFactory.createCar("CIVIC", "Amarela", "2005");
        System.out.print("Criado um " + sedan.getModel() + " da cor " + sedan.getColor() + "do ano " + sedan.getYear());
    }
}