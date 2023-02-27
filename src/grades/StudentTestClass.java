package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentTestClass {

public static Map<String, Student>students() {
    Map<String, Student> students = new HashMap<>();

    Student student1 = new Student("Jethro");

    student1.addGrade(98);
    student1.addGrade(72);
    student1.addGrade(88);
    student1.addGrade(70);

    Student student2 = new Student("Ziva");

    student2.addGrade(95);
    student2.addGrade(67);
    student2.addGrade(82);

    Student student3 = new Student("Tony");

    student3.addGrade(97);
    student3.addGrade(66);
    student1.addGrade(86);

    Student student4 = new Student("Timothy");

    student4.addGrade(95);
    student4.addGrade(88);
    student4.addGrade(87);

    return students;
}

    public static void main(String[] args) {


    }

}