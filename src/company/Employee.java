package company;

abstract class Employee {

    private Role role;

    Employee(Role role){
        this.role = role;
    }

    void setRole(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    abstract float Payment();
}
