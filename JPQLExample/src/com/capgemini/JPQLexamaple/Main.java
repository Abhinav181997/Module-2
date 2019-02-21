package com.capgemini.JPQLexamaple;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {

	public static void main(String[] args) {
	
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("Abhinav");
		EntityManager entityManager = emFactory.createEntityManager();
		
/*------------Displaying all the details of Emp table----------------------------*/
		  
		Query query = entityManager.createQuery("Select e from Employee e");
		List<Employee> list = query.getResultList();

		for(Employee e:list) {
		System.out.println("Employee NAME :"+e);
		      
			      
/*-------------Displaying salary between 15000 to 30000---------------------------*/
		
		Query query1 = entityManager.createQuery( "Select e " + "from Employee e " + "where e.salary " + "Between 15000 and 30000" );
	      
	    List<Employee> list1=(List<Employee>)query1.getResultList( );

	    for( Employee e1:list1 )
	    {
	      System.out.print("Employee ID :" + e1.getEmpNo( ));
	      System.out.println("\t Employee salary :" + e1.getSal( ));
	    }

/*---------------Displaying max salary from Emp table-----------------------------*/	    
	    
	    Query query11 = entityManager.createQuery("Select MAX(e.salary) from Employee e");
	     Double result = (Double) query11.getSingleResult();
	     
	     System.out.println("Max Employee Salary :" + result);  
	     

/*----------------Displaying Employee detail whose slary is max in their respective department=-----------------*/
	     Query query2=entityManager.createQuery("Select e" + " where e.salary" + " in(Select max(slary) from Employee a group by DEPTNO)");
	     
	     List<Employee> list2=(List<Employee>)query1.getResultList( );
		
	     for( Employee e1:list2 )
		    {
		      System.out.print("Employee ID :" + e1.getEmpNo( ));
		      System.out.println("\t Employee salary :" + e1.getSal( ));
		    }

	     emFactory.close();
	     entityManager.close();
		}
	}
}