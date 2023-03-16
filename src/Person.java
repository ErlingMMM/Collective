//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Person {
    private String name;
    private int age;
    private String epost;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", epost='" + epost + '\'' +
                '}';
    }

    public Person(String name, int age, String epost) {
         this.name = name;
         this.age = age;
         this.epost = epost;

    }
}
