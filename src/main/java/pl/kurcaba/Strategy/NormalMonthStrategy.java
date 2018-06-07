package pl.kurcaba.Strategy;

/**
 * Strategy for normal month
 */
public class NormalMonthStrategy implements Strategy {

    @Override
    public void setSalary(int ammount,Employee employee) {

        employee.setSalary(ammount);

    }
}
