class Employee {
    String firstName;
    String lastName;
    String cnic;

    Employee(String firstName, String lastName, String cnic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cnic = cnic;
    }

    void setFirstName(String firstName) { this.firstName = firstName; }
    String getFirstName() { return firstName; }
    void setLastName(String lastName) { this.lastName = lastName; }
    String getLastName() { return lastName; }
    void setCnic(String cnic) { this.cnic = cnic; }
    String getCnic() { return cnic; }

    public String toString() {
        return firstName + " " + lastName + " | CNIC: " + cnic;
    }

    double earnings() {
        return 0.00;
    }
}

class SalariedEmployee extends Employee {
    double weeklySalary;

    SalariedEmployee(String firstName, String lastName, String cnic, double weeklySalary) {
        super(firstName, lastName, cnic);
        this.weeklySalary = weeklySalary;
    }

    void setWeeklySalary(double weeklySalary) {
        if (weeklySalary >= 0) this.weeklySalary = weeklySalary;
        else System.out.println("Salary cannot be negative.");
    }

    double getWeeklySalary() { return weeklySalary; }

    public String toString() {
        return "Salaried Employee: " + super.toString();
    }

    public double earnings() { return weeklySalary; }
}

class HourlyEmployee extends Employee {
    double wage;
    double hours;

    HourlyEmployee(String firstName, String lastName, String cnic, double wage, double hours) {
        super(firstName, lastName, cnic);
        this.wage = wage;
        this.hours = hours;
    }

    void setWage(double wage) {
        if (wage >= 0) this.wage = wage;
        else System.out.println("Wage cannot be negative.");
    }

    void setHours(double hours) {
        if (hours >= 0) this.hours = hours;
        else System.out.println("Hours cannot be negative.");
    }

    public String toString() {
        return "Hourly Employee: " + super.toString();
    }

    public double earnings() {
        if (hours <= 40) return wage * hours;
        else return (40 * wage) + ((hours - 40) * wage * 1.5);
    }
}

class CommissionEmployee extends Employee {
    double grossSales;
    double commissionRate;

    CommissionEmployee(String firstName, String lastName, String cnic, double grossSales, double commissionRate) {
        super(firstName, lastName, cnic);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    void setGrossSales(double grossSales) { this.grossSales = grossSales; }
    double getGrossSales() { return grossSales; }
    void setCommissionRate(double commissionRate) { this.commissionRate = commissionRate; }
    double getCommissionRate() { return commissionRate; }

    public String toString() {
        return "Commission Employee: " + super.toString();
    }

    public double earnings() { return grossSales * commissionRate; }
}

class BasePlusCommissionEmployee extends CommissionEmployee {
    double baseSalary;

    BasePlusCommissionEmployee(String firstName, String lastName, String cnic, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, cnic, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0) this.baseSalary = baseSalary;
        else System.out.println("Base salary cannot be negative.");
    }

    double getBaseSalary() { return baseSalary; }

    public String toString() {
        return "Base Plus Commission Employee: " + super.toString();
    }

    public double earnings() { return baseSalary + super.earnings(); }
}

class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = {
            new SalariedEmployee("Muhammad", "Ali", "11111-1111111-1", 800.00),
            new HourlyEmployee("Hasnain", "Ali", "44444-4444444-4", 16.75, 40),
            new CommissionEmployee("Tarwan", "Kumar", "22222-2222222-2", 10000, 0.06),
            new BasePlusCommissionEmployee("Fabeeha", "Fatima", "33333-3333333-3", 5000, 0.04, 300)
        };

        for (Employee e : employees) {
            System.out.println(e.toString());
            System.out.println("Earnings: " + e.earnings());

            // Downcasting demo
            if (e instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee bp = (BasePlusCommissionEmployee) e;
                double oldSalary = bp.getBaseSalary();
                bp.setBaseSalary(oldSalary * 1.10);
                System.out.println("Base salary raised 10% to: " + bp.getBaseSalary());
                System.out.println("New earnings: " + bp.earnings());
            }
            System.out.println();
        }
    }
}
