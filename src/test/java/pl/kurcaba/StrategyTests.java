package pl.kurcaba;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.kurcaba.Strategy.*;

public class StrategyTests {

    Strategy paySalaryStrategy = null;
    Employee exampleEmployee = new Employee();
    int salaryBase = 1000;

    @Test
    public void NormalMonthStrategyTest()
    {
        paySalaryStrategy = new NormalMonthStrategy();
        paySalaryStrategy.setSalary(salaryBase,exampleEmployee);
        Assertions.assertEquals(1000,exampleEmployee.getSalary(),"Normal month strategy test failed");
    }

    @Test
    public void SpecialMonthStrategyTest()
    {
        paySalaryStrategy = new SpecialMonthStrategy();
        paySalaryStrategy.setSalary(salaryBase,exampleEmployee);
        Assertions.assertEquals(1100,exampleEmployee.getSalary(),"Special month strategy test failed");

    }
    @Test
    public void SuperSpecialMonthStrategyTest()
    {
        paySalaryStrategy = new SuperSpecialMonthStrategy();
        paySalaryStrategy.setSalary(salaryBase,exampleEmployee);
        Assertions.assertEquals(1500,exampleEmployee.getSalary(),"Super special month strategy test failed");
    }



}
