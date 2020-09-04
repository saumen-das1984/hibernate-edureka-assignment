package com.edureka.assignment2.crud.hbmxmlconf;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class DataManager {
	
	// TODO 
	// drop database edureka
	// create database edureka
	public static void main(String[] args) {
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory sessionFactory = meta.getSessionFactoryBuilder().build();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		System.out.println("start");
		Branch branch = new Branch();
		branch.setBranchId(3);
		branch.setBranchName("Test Branch");
		branch.setBranchStatus(true);
		session.persist(branch);
		transaction.commit();  
		session.close();  
		sessionFactory.close();
		System.out.println("successfully saved");  
	}

}
