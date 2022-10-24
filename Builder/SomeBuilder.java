package Builder;

public class SomeBuilder implements SomeBuilder{
    Some some = new Some();

    @Override
    public SomeBuilder setSome(String name) {
        some.name = name;
        return this;
    }

    @Override
    public SomeBuilder setAge(int age) {
        some.age = age;
        return this;
    }

    @Override
    public SomeBuilder setSalary (double salary) {
        some.salary = salary;
        return this;
    }

    @Override
    public SomeBuilder setDogName(String dogName) {
        String dogName1 = some.dogName;
        return this;
    }

    @Override
    public Some build() {
        return some;
    }
}