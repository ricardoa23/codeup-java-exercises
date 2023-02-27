package grades;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentName;
    private ArrayList<Integer> grades;

    public Student(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public Student(String studentName) {
        this.studentName = studentName;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        int average = 0;
        double length = this.grades.size();
        for (int grade : this.grades){
                average += grade;
        }
        return average / length;
    }
}
