package HomeWork5;

import HomeWork5.comparators.StudentAgeComparator;
import HomeWork5.comparators.StudentNameComparator;
import HomeWork5.comparators.StudentScoreComparator;
import HomeWork5.dto.Student;
import HomeWork5.suppliers.RandomStudentSupplier;
import HomeWork5.utils.Randomator;
import HomeWork5.utils.SortUtils;
import HomeWork5.utils.api.IRandom;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<Student> studentCollection = new ArrayList<>();
        IRandom rnd = new Randomator();
        AtomicInteger counter = new AtomicInteger(0);
        Supplier<Student> supplier = new RandomStudentSupplier(counter, rnd);

        do {
            studentCollection.add(supplier.get());
        } while (studentCollection.size() < 10_000);

        List<Student> sortedStudentCollection = new ArrayList<>();

        sortByAgeAndScore(studentCollection, sortedStudentCollection);
        ///by name sort
        System.out.println("----------Top 10 by name----------\n");
        Comparator<Student> studentNameComparator = new StudentNameComparator();
        SortUtils.bubbleSort(sortedStudentCollection, studentNameComparator);
        printFirstTen(sortedStudentCollection);

        ///by score sort
        System.out.println("----------Top 10 by age----------\n");
        Comparator<Student> studentScoreComparator = new StudentScoreComparator();
        SortUtils.coctailSort(sortedStudentCollection, studentScoreComparator.reversed());
        printFirstTen(sortedStudentCollection);

        ///by age and score
        System.out.println("----------Top 10 by age and score----------");
        Comparator<Student> studentAgeAndScoreComparator =
                new StudentAgeComparator().thenComparing(new StudentScoreComparator());
        SortUtils.coctailSort(sortedStudentCollection, studentAgeAndScoreComparator);
        printFirstTenByAgeAndScore(sortedStudentCollection);
    }

    public static void sortByAgeAndScore(List<Student> studentCollection, List<Student> sortedStudentCollection) {
        for (Student student : studentCollection) {
            if(student.getAge() >= 12 && student.getScore() > 8) {
                sortedStudentCollection.add(student);
            }
        }
    }

    public static void printFirstTen(List<Student> studentCollection) {
        for (int i = 0; i < 10; i++) {
            printStudent(studentCollection.get(i));
        }
    }

    public static void printFirstTenByAgeAndScore(List<Student> studentCollection) {
        Iterator<Student> iter = studentCollection.iterator();
        int ageStudent = iter.next().getAge(), outputStudentNumber = 0;
        while(iter.hasNext()) {
            if(iter.next().getAge() == ageStudent && outputStudentNumber < 10) {
                printStudent(iter.next());
                outputStudentNumber++;

                if(outputStudentNumber == 10) {
                    outputStudentNumber = 0;
                    ageStudent++;
                }
            }
        }
    }

    public static void printStudent(Student student) {
        System.out.println("№: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Average score: " + student.getScore());
        System.out.println("Is olympic participant: " + student.isOlympicParticipant() + "\n");
    }
}
