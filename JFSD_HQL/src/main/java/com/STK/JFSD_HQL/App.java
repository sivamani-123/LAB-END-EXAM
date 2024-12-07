package com.STK.JFSD_HQL;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
      try {
        System.out.println( "Hello Hibernate" );
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tnx = s.beginTransaction();
        Student sd = new Student();
        sd.setSid(17);
        sd.setSname("Vidhya");
        sd.setGender("Female");
        sd.setDepartment("CSE");
        sd.setProgram("B.TECH");
        sd.setDateOfBirth("08-05-2004");
        sd.setContactNumber("6301329549");
        sd.setGraduationStatus("Pursuing");
        sd.setCgpa(9.5);
        sd.setNumberOfBacklogs(0);
        System.out.println("Data Inserted");
        s.save(sd); 
        tnx.commit();
        s.close();
      }catch(Exception e) {
        e.printStackTrace();
      }
    }
}