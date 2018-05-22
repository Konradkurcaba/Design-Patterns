package pl.kurcaba.Strategy;

public class Main {



    public static void main(String... args)
    {
        // Normal month strategy
        Strategy paymentStrategy = new NormalMonthStrategy();
        Employee employee = new Employee();

        paymentStrategy.setSalary(1000,employee);
        System.out.println(employee.getSalary());

        //Special month strategy
        paymentStrategy = new SpecialMonthStrategy();
        paymentStrategy.setSalary(1000,employee);
        System.out.println(employee.getSalary());

    }
}
