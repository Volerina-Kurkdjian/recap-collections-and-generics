import bounded.BoundedTypes;
import bounded.Person;

public class Main {

    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        FirstExercise firstExercise=new FirstExercise();
        System.out.println(firstExercise.checkEquality(1,1));
        System.out.println(firstExercise.checkEquality(1.4,1));
        System.out.println(firstExercise.checkEquality(1.4,1.4));
        System.out.println(firstExercise.checkEquality('a','a'));

        BoundedTypes boundedTypes=new BoundedTypes();
        System.out.println(boundedTypes.calculateMin(1,2));
        System.out.println(boundedTypes.calculateMin("cc","bbbb"));

        Person person=new Person(10);
        Person person1=new Person(20);
        System.out.println(boundedTypes.calculateMin(person1,person));

    }
}