package com.Vehicle;

import org.hibernate.Transaction;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class User {
	
//	  public static <E> void sortList(List<E> list, Comparator<E> comparator) {
//	        Collections.sort(list, comparator); 
//	    }

	

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		
		List<String> list = new LinkedList<>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of List company you want to add");
		int size = s.nextInt();
		System.out.println("Enter Company anme");
		for (int i = 0; i < size; i++) {
			list.add(s.next());
		}

		Object [] arr = list.toArray();
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println("Sorted List:" +list);
		
		
		
		System.out.println("--------------------------------");
		// save beans
		
		
		

		@SuppressWarnings("rawtypes")
		List list1 = new ArrayList<>();

		list1.add(new TwoWheelers(1, arr[0], "Xtreme", "12-10-2012", 2, 20));
		list1.add(new TwoWheelers(2,arr[0], "Xtreme2", "12-10-2014", 2, 22));
		list1.add(new TwoWheelers(3,arr[0], "Xtreme3", "12-10-2018", 2, 25));

		List<ThreeWheelers> list2 = new ArrayList<>();

		list2.add(new ThreeWheelers(arr[1], "Vikram", "12-10-2012", 3, 45));
		list2.add(new ThreeWheelers(arr[1], "Vikram2", "12-10-2014", 3, 48));
		list2.add(new ThreeWheelers(arr[1], "Vikram3", "12-10-2018", 3, 52));

		List<FourWheelers> list3 = new ArrayList<>();

		list3.add(new FourWheelers("Z_Motors", "Swift", "12-10-2012", 4, 75));
		list3.add(new FourWheelers("Z_Motors", "Swift2", "12-10-2014", 4, 80));
		list3.add(new FourWheelers("Z_Motors", "Swift3", "12-10-2018", 4, 85));
		
		Set<TwoWheelers> foo = new LinkedHashSet<>(list1);
		
		foo.stream().forEach(a->{
			System.out.println(a);
		});
           Set<ThreeWheelers> fo = new LinkedHashSet<>(list2);
		
		fo.stream().forEach(a->{
			System.out.println(a);
		});
		
		// hibernate connection
		
				Configuration con = new Configuration().configure().addAnnotatedClass(TwoWheelers.class);
			       
			       ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
			       
			       SessionFactory sf = con.buildSessionFactory(reg);
			        
			        
			        Session session = sf.openSession();
			        
			        Transaction tx = session.beginTransaction();
			        session.save(list1);
			        tx.commit();
//		Iterator<TwoWheelers> itr1 = list1.iterator();
//		while (itr1.hasNext()) {
//			System.out.println(itr1.next());
//		}

//		System.out.println("--------------------------------");
//
//		Iterator<ThreeWheelers> itr2 = list2.iterator();
//		while (itr2.hasNext()) {
//			System.out.println(itr2.next());
//		}
//
//		System.out.println("--------------------------------");
//
//		Iterator<FourWheelers> itr3 = list3.iterator();
//		while (itr3.hasNext()) {
//			System.out.println(itr3.next());
//		}

	}

}
