package company;

public class SalariedEmployee extends Employee {

    SalariedEmployee() {
        super(Role.SALARIED);
    }

    @Override
    float Payment() {
        return (50 * 8) * 20;
    }
}
