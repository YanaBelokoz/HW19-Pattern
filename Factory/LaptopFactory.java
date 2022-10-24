package Factory;

public class LaptopFactory {
    public static Laptop getLaptop (String type, String screenDiagonal, String memory, String modelLaptop, String s) {
        if ("Lenovo".equalsIgnoreCase(type)) return new Lenovo(screenDiagonal, memory, modelLaptop);
        else if ("iPad".equalsIgnoreCase(type)) return new iPad (screenDiagonal, memory, modelLaptop);
        return null;
    }
}
