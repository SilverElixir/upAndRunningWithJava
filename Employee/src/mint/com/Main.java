package mint.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class Main  {

public static void main(String[] args) {
	
        List<Worker> workers = new ArrayList<Worker>(){
            {
                add(new Employee(1, "Johny Depp", 3232.45));
                add(new Contractor(2, "Bradley Groove", 18.5));
                add(new Contractor(3, "Angelina Jolie", 19.7));
                add(new Employee(4, "Cliwe Owen", 3100.9));
                add(new Employee(5, "Jessica Biel", 3078.4));
                add(new Employee(6, "Robert De Niro", 3307.89));
            }};
          
        // a) Sort the collection of employees in descending order by the average monthly salary. In the case of
        //equal salary – by the name. Write ID, name and monthly salary for all employees from collection

        //Collections.sort(workers, new EmployeesByAvgSalaryDesc());

            Collections.sort(workers, new Comparator<Worker>() {

				@Override
				public int compare(Worker w1, Worker w2) {
					if(w1.getSalary() > w2.getSalary()){
						return 1;
					}
					else if(w1.getSalary() < w2.getSalary()){
						return -1;
					}
						return 0;
				}});

        for (Worker w : workers) {
            System.out.println(w);
        }
        
        System.out.println("- - - - - - - -");
        
        // b) Write information about first five employees from collection 
        for(int i=0;i<5;i++){
        	System.out.println(workers.get(i));
        }
        
        System.out.println("- - - - - - - -");
        
        // c) Write ID of three last employees from collection 
        int j = workers.size()-1;
        while(j>2){
        	System.out.println(workers.get(j));
        	j--;
        }
        
        System.out.println("- - - - - - - -");
        
        // d) Write code for reading and writing collection of these objects from (into) file.
        File f = new File("/Users/capitol/Downloads/collection.txt");
        
        try(BufferedWriter br = new BufferedWriter(new FileWriter(f))){
            for (Worker w : workers) {
            	br.write(w.toString());
            	br.newLine();
          }
            System.out.println("Collection was successfully written to the file");
        }
        catch(IOException ex){
        	System.out.println("Unable to write to file: " + f);
        	ex.getMessage();
        }
        }
    }





