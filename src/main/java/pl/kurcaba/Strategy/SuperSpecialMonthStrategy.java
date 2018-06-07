package pl.kurcaba.Strategy;

public class SuperSpecialMonthStrategy implements Strategy{

    @Override
    public void setSalary(int ammount, Employee employee) {
        int ammountAfterBonus = ammount + (int) (ammount * 0.5);
        employee.setSalary(ammountAfterBonus);
    }
}
