package company;

public class Executive extends Employee {

    Executive() {
        super(Role.EXECUTIVE);
    }

    @Override
    float Payment() {
        return (160 * 8) * 20;
    }
}
