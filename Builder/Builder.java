package Builder;

public class Builder {
    public static void main(String[] args) {
        Some some = new SomeBuilderImpl().setName("Name").setAge(18).build();
        System.out.println(some.toString());
        Some some2 = new SomeBuilderImpl().setName("Name2").setAge(18).setSalary(111).setDogName("Bobik").build();
        some2.print();
    }
}