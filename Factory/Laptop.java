package Factory;

public abstract class Laptop {
    public String getScreenDiagonal() {
        return null;
    }

    public String getMemory() {
        return null;
    }

    public abstract String getModelLaptop();

    @Override
    public String toString(){return "[Laptop model - " + this.getModelLaptop() +
    ", screen diagonal - " + this.getScreenDiagonal() +
    ", laptop memory - " + this.getMemory() + "]";}
}
