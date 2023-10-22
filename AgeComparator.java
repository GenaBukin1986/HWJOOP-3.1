package ru.geekbrains.lesson3.task2;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int result = Integer.compare(o2.age,o1.age);
        if (result == 0){
            return o1.surName.compareTo(o2.surName);
        }
        return result;
    }
}
