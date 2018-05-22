package pl.kurcaba.Strategy;

public class NormalMonthStrategy implements Strategy {

    @Override
    public void setSalary(int ammount,Employee employee) {

        employee.setSalary(ammount);

    }
}
