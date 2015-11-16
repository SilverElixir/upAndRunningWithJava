package mint.com;

/**
 * Employee - worker with fixed payment
 */
public class Employee extends Worker {

    public Employee(int id, String name, double salary){
        super(id, name);
        this.salary = salary;
    }

    double salary;

    @Override
    public String toString() {
        return id + ") " + name + " has average monthly salary equal to " + salary;
    }

//    @Override
//    public int compareTo(Worker other) {
//        return Double.compare(this.getSalary(), other.getSalary());
//    }
}
