package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeMain
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        
        Employee emp1=new Employee();
        emp1.setEmpId(1);
        emp1.setEmpName("xyz");
        emp1.setEmpDept("IT");
        emp1.setEmpDesig("Anyalist");
        emp1.setSalary(100);
        
        Employee emp2=new Employee();
        emp2.setEmpId(2);
        emp2.setEmpName("abc");
        emp2.setEmpDept("CS");
        emp2.setEmpDesig("Worker");
        emp2.setSalary(50000);
        
        session.save(emp1);
        session.save(emp2);
        tx.commit();
        session.close();
        System.out.println("Employee ka data add hua....");
    }
}
