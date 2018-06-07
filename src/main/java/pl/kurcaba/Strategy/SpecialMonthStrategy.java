package pl.kurcaba.Strategy;


/**
 * Strategy for special month
 */
public class SpecialMonthStrategy implements Strategy {

    @Override
    public void setSalary(int ammount, Employee employee) {
        int ammountAfterBonus = ammount + (int) (ammount * 0.1);
        employee.setSalary(ammountAfterBonus);
    }
}
