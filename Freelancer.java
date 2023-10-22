package ru.geekbrains.lesson3.task2;

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 */
public class Freelancer extends Employee{
    protected int workHourMouth = 0; // Общее количество часов, отработанных за месяц фрилансером
    public Freelancer(String surName, String name, int age, double salary,int workHourMouth) {
        super(surName, name, age, salary);
        if (workHourMouth > 720) this.workHourMouth = 720; // в сутках 24 часа в месяце 30 дней
        else this.workHourMouth = workHourMouth;
    }

    @Override
    public double calculateSalary() {
        return salary * workHourMouth; //«среднемесячная заработная плата = 20.8 * общее количество отработанных часов»
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Возраст %d; Среднемесячная заработная плата: %.2f руб.",
                surName, name, age, calculateSalary());
    }
}
