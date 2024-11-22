package laboratory3.ex4;

import java.util.Date;
import java.util.Objects;
import java.util.Vector;

class Manager extends Employee {
    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, double salary, Date hireDate, String nationalInsuranceNumber, double bonus) {
        super(name, salary, hireDate, nationalInsuranceNumber);
        this.bonus = bonus;
        this.team = new Vector<>();
    }

    public void addTeamMember(Employee employee) {
        team.add(employee);
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Manager manager = (Manager) obj;
        return Double.compare(manager.bonus, bonus) == 0 &&
                Objects.equals(team, manager.team);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", hireDate=" + getHireDate() +
                ", bonus=" + bonus +
                ", team=" + team +
                '}';
    }

    @Override
    public int compareTo(Employee other) {
        if (other instanceof Manager) {
            Manager otherManager = (Manager) other;
            int salaryComparison = Double.compare(this.getSalary(), otherManager.getSalary());
            return salaryComparison != 0 ? salaryComparison : Double.compare(this.bonus, otherManager.bonus);
        }
        return super.compareTo(other);
    }

    @Override
    protected Manager clone() {
        Manager cloned = (Manager) super.clone();
        cloned.team = (Vector<Employee>) this.team.clone(); // Shallow clone of the team
        return cloned;
    }
}