package bounded;

public class Person implements Comparable<Person>{

    int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(age, o.getAge());
    }
}
