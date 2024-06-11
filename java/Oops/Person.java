package Oops;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}

class Employee extends Person {
    double annual_salary;
    String year_of_join;
    String insurance_number;

    Employee(String name, double annual_salary, String year_of_join, String insurance_number) {
        super(name);  // Call the constructor of the Person class to initialize the name
        this.annual_salary = annual_salary;
        this.year_of_join = year_of_join;
        this.insurance_number = insurance_number;
    }

    String EmployeeDetails() {
        return "EmployeeName: " + getName() + ", Salary: " + Double.toString(annual_salary)+", Ins_num: "+insurance_number+", Joined on: "+year_of_join;
    }
}

class TestEmployee{
    public static void main(String[] args) {
        Person a = new Person("Varma");
        System.out.println(a.getName());

        Employee e = new Employee(a.name.toString(), 5000.00, "2023", "INS123456");
        System.out.println(e.EmployeeDetails());
    }
}
