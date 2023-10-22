package ru.geekbrains.lesson3.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Employee>  workers = EmployeeFabric.generateEmployees(15);
        for (Employee worker : workers) {
            System.out.println(worker);
        }

//        System.out.println();
//        System.out.println("***");
//        System.out.println();
//
//        workers.sort(new SalaryComparator());
//
//        for (Employee worker : workers) {
//            System.out.println(worker);
//        }
//
        System.out.println();
        System.out.println("***");
        System.out.println();

        workers.sort(new AgeComparator());

        for (Employee worker : workers) {
            System.out.println(worker);
        }

//        workers.sort((w1,w2)->w1.surName.compareTo(w2.surName));
//
//        System.out.println();
//        System.out.println("***");
//        System.out.println();
//
//
//        for (Employee worker : workers) {
//            System.out.println(worker);
//        }


        System.out.println();
        System.out.println("***");
        System.out.println();

//        workers.sort(new AgeComparator());

        for (Employee worker : workers) {
            System.out.println(worker);
        }

    }

}
