package Factory;

public class Lenovo extends Laptop {
    private String screenDiagonal;
    private String memory;
    private String modelLaptop;

    public Lenovo(String screenDiagonal, String memory, String modelLaptop) {
        this.screenDiagonal = screenDiagonal;
        this.memory = memory;
        this.modelLaptop = modelLaptop;
    }

    @Override
    public String getScreenDiagonal() {
        return this.screenDiagonal;
    }

    @Override
    public String getMemory() {
        return this.memory;
    }

    @Override
    public String getModelLaptop() {
        return this.modelLaptop;
    }
}
