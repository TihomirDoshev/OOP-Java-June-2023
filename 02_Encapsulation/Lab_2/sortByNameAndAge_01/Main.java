package OOP.Lesson_2_Encapsulation.Lab_2.sortByNameAndAge_01;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numOfPeople = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < numOfPeople; i++) {
            String [] input = scanner.nextLine().split("\\s+");
            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);

            Person person = new Person(firstName,lastName,age);
            people.add(person);

        }
        Collections.sort(people, Comparator.comparing(Person::getFirstName).thenComparingInt(Person::getAge));

        for (Person person : people) {
            System.out.println(person);

        }
    }
}
