package mint.com;

import java.util.Comparator;

/**
 * Sort the collection of employees in descending order by the average monthly salary. In the case of
equal salary – by the name
 */
public class EmployeesByAvgSalaryDesc implements Comparator<Worker> {

	@Override
	public int compare(Worker w1, Worker w2) {
		
		Double salary1 = w1.getSalary();
		Double salary2 = w2.getSalary();
		String name1 = w1.getName();
		String name2 = w2.getName();
		
		return salary1.compareTo(salary2);
		
//		return((salary1 < salary2) ? 1 : (salary1 > salary2) ? -1 : 0);
		
//		if(salary1 != salary2){
//			return salary1.compareTo(salary2);
//		}
//		else{
//			return name1.compareTo(name2);
//		}
	}
}
