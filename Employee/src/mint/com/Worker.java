package mint.com;

/**
 * Worker - parent class for Employee and Contractor
 */
public abstract class Worker {

    int id;
    String name;
    double salary;

    public Worker(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
    	return id;
    }
    
    public String getName(){
    	return name;
    }
    
    public Double getSalary(){
    	return salary;
    }

        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker)) return false;

        Worker worker = (Worker) o;

        if (id != worker.id) return false;
        if (Double.compare(worker.salary, salary) != 0) return false;
        if (!name.equals(worker.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + name.hashCode();
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
