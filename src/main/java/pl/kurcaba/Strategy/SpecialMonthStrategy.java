package pl.kurcaba.Strategy;

public class SpecialMonthStrategy implements Strategy {

    @Override
    public void setSalary(int ammount, Employee employee) {
        int ammountAfterBonus = ammount + (int) (ammount * 0.1);
        employee.setSalary(ammountAfterBonus);
    }
}
