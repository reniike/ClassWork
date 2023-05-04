package chapterSeventeen.revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentDriver {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Renike", 5);
        Student student2 = new Student("Zainab", 5);
        Student student3 = new Student("Omotayo", 6);
        Student student4 = new Student("Tinuade", 7);
        Student student5 = new Student("Eniola", 8);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        students.sort(Comparator.comparing(Student::getAge));
        students.sort(Comparator.comparing(student -> student.getAge()));

        System.out.println(students);

    }
//    static class sortByAge implements Comparator<Student>{
//        @Override
//        public int compare(Student o1, Student o2) {
//            Student student1 =  o1;
//            Student student2 =  o2;
//
//            if (student1.getAge() == student2.getAge()) return 0;
//            if (student1.getAge() < student2.getAge()) return -1;
//            if (student1.getAge() > student2.getAge()) return 1;
//
//
//            return o1.getAge() - o2.getAge();
//        }
//    }
//


}
