package Builder;

  public class Some {
      String name;
      int age;
      double salary;
      String dogName;
      public void print() {
          String s = name + " " + age + " " + salary + " " + dogName;
      }

      @Override
      public String toString() {
          return "Some{" +
                  "name='" + name + '\'' +
                  '}';
      }
}