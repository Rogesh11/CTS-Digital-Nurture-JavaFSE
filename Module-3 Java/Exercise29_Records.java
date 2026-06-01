import java.util.List;

record Person(String name, int age) {}

public class Exercise29_Records {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", 25),
                new Person("Alice", 18),
                new Person("Bob", 15),
                new Person("David", 30)
        );

        people.stream()
                .filter(p -> p.age() >= 18)
                .forEach(System.out::println);
    }
}
/*
Output:
Person[name=John, age=25]
Person[name=Alice, age=18]
*/

