package ru.geekbrains.lesson3.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    public static Worker generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман","Николай","Ян" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов","Петров" };
        int age = random.nextInt(18,65);
        int salaryWorker = random.nextInt(400, 900);
        return new Worker(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],age,
                salaryWorker);
    }

    public static Freelancer generateFreelancer(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман","Николай","Ян" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов","Петров" };
        int age = random.nextInt(18,65);
        int salaryFreelancer = random.nextInt(100, 600);
        int workHourMouth = random.nextInt(100,400);
        return new Freelancer(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],age,
                salaryFreelancer,workHourMouth);
    }


    public static Engineer generateEngineer(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман","Николай","Ян" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов","Петров" };
        int age = random.nextInt(18,65);
        int salaryEngineer = random.nextInt(600, 1200);
        return new Engineer(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],age,
                salaryEngineer);
    }

    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     * @param count
     * @return
     */
    public static List<Employee> generateEmployees(int count){
//        Worker[] workers = new Worker[count];
        List<Employee> employees = new ArrayList<>();
        // 20% это инженеры, 71% рабочие, 9% фрилансеры
        int countEngineer = (int)(0.2 * count);
        int countWorker = (int) (0.71 * count);
        int countFreelancer = count - countWorker - countEngineer;
        for (int i = 0; i < countWorker; i++){
            employees.add(generateWorker());
        }
        for (int i = 0; i < countEngineer; i++){
            employees.add(generateEngineer());
        }
        for (int i = 0; i < countFreelancer; i++){
            employees.add(generateFreelancer());
        }

        return employees;
    }

}
