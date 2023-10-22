package ru.geekbrains.lesson3.task2;

public class Engineer extends Employee{
    public Engineer(String surName, String name, int age, double salary) {
        super(surName, name, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary * 22.1 * 8;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Инженер; Возраст %d; Среднемесячная заработная плата: %.2f руб.",
                surName, name, age, calculateSalary());
    }
}
