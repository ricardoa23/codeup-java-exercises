import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] array, Person newPerson) {
       array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = newPerson;
        return array;
    }



    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(numbers));

        Person[] persons = new Person[] {
                new Person("person1"),
                new Person("person2"),
                new Person("person3")
        };

        Person person4 = new Person("person4");

        System.out.println(persons[2].getName());



        persons = addPerson(persons, person4);

        for (Person person : persons) {

            System.out.println(person.getName());

        }

    }
}
