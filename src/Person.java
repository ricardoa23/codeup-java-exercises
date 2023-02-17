public class Person {

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public void sayHello(){
        System.out.printf("Hello, %s\n", getName());
    }

    public Person(String name) {
        setName(name);
    };

    public static void main(String[] args) {
        Person person3 = new Person("Rick");
        person3.sayHello();
        person3.setName("Rick Ayala");
        person3.sayHello();

        Person person4 = new Person("BillyBob");
        person4.sayHello();
        person4.setName("Billy Bob");
        person4.sayHello();


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);


//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);


//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());


    }
}
