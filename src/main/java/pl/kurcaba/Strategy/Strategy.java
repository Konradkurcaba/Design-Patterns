package pl.kurcaba.Strategy;

public interface Strategy {

    /**
     *
     * @param ammount new salary amount
     * @param employee which salary will be changing
     */

    void setSalary(int ammount, Employee employee);
}
