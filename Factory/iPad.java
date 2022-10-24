package Factory;

public class iPad extends Laptop {
    private String screenDiagonal;
    private String memory;


    public iPad (String screenDiagonal, String memory, String modelLaptop) {
        this.screenDiagonal = screenDiagonal;
        this.memory = memory;
    }

    private String modelLaptop;
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
