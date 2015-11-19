package mint.com;

/**
 * Employee - worker with fixed payment
 */
public class Employee extends Worker {

    public Employee(int id, String name, double salary){
        super(id, name, salary);
    }

    @Override
    public String toString() {
        return id + ") " + name + " has average monthly salary equal to " + salary;
    }

}
