class Employee {

    String name;
    int salary;
    String address;

    final String unknown = "unknown"

    Employee() {
        name = unknown;
        address = unknown;
        salary = 0;
    }

    public Employee(String name, int salary, String address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.address = unknown;
    }

}