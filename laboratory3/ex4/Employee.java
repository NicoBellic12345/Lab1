package laboratory3.ex4;

import java.util.Date;
import java.util.Objects;

class Employee extends Person implements Comparable<Employee>, Cloneable {
    private double salary;
    private Date hireDate;
    private String nationalInsuranceNumber;

    public Employee(String name, double salary, Date hireDate, String nationalInsuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Employee employee = (Employee) obj;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(hireDate, employee.hireDate) &&
                Objects.equals(nationalInsuranceNumber, employee.nationalInsuranceNumber);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                ", nationalInsuranceNumber='" + nationalInsuranceNumber + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    protected Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Should never happen
        }
    }
}
