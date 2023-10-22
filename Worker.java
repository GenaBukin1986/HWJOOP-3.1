package ru.geekbrains.lesson3.task2;

/**
 * Рабочий (работает с 9 до 18,
 * получает фиксированную заработную плату)
 */
public class Worker extends Employee {


    public Worker(String surName, String name,int age, double salary) {
        super(surName, name,age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary * 20.8 * 8; //«среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Возраст %d; Среднемесячная заработная плата: %.2f руб.",
                surName, name,age, calculateSalary());
    }
}
