package company;

public class Manager extends Employee {

    Manager() {
        super(Role.MANAGER);
    }

    @Override
    float Payment() {
        return (100 * 8) * 20;
    }
}
