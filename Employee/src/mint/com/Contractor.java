package mint.com;

/**
 * Contractor - worker with salary, based on hourly rates
 */
public class Contractor extends Worker {
	
    public Contractor(int id, String name, double hourlyRate) {
        super(id, name);
        salary = 20.8 * 8 * hourlyRate;
    }

    @Override
    public String toString() {
        return id + ") " + name + " has average monthly salary equal to " + salary;
    }

//    @Override
//    public int compareTo(Worker other) {
//        return Double.compare(this.getSalary(), other.getSalary());
//    }
}
