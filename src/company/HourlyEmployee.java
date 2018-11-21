package company;

public class HourlyEmployee extends Employee {

    HourlyEmployee() {
        super(Role.HOURLY);
    }

    @Override
    float Payment() {
        return (8 * 48) * 20;
    }
}
