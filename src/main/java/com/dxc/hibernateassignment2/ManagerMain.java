package com.dxc.hibernateassignment2;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManagerMain {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();		
		Transaction transaction = session.beginTransaction();
		Department dept1 = new Department();
		
		Department dept2 = new Department();
		Department dept3 = new Department();
		Department dept4 = new Department();
		
		dept1.setDeptName("IT");
		dept1.setDeptId(101);
		dept2.setDeptName("EC");
		dept2.setDeptId(102);
		dept3.setDeptName("CS");
		dept3.setDeptId(103);
		dept4.setDeptName("IS");
		dept4.setDeptId(104);
		Manager mgr1 = new Manager(111L, "Parantap",  dept1);
		Manager mgr2 = new Manager(112L, "Abhinav",  dept2);
		Manager mgr3 = new Manager(113L, "Sriram",  dept3);
		Manager mgr4 = new Manager(114L, "Neerja",  dept4);
		
		
		Set<Manager> managers = new HashSet<Manager>();
		managers.add(mgr1);
		managers.add(mgr2);
		managers.add(mgr3);
		managers.add(mgr4);
		
		
		dept1.setmanagers(managers);
			session.persist(dept1);
		
		//if Cascade.Type is set to PERSIST or ALL- no need of following statements
		
		
		session.persist(dept2);
		session.persist(dept3);
		session.persist(dept4);
		
		
		transaction.commit();
		session.close();
	}

}
