package com.klef.jfsd.exam;

import java.sql.Statement;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class Hql{
  public static void main(String[] args) {
    
    Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tnx = s.beginTransaction();
        
        //HQL Query to display all student records with all columns
       /* Query q = s.createQuery("from Student"); //here Student is persistence class name not a database table name
        List<Student> li = q.list();
        //System.out.println(li);
        for(Student s1 : li) {
          System.out.println(s1);
        }
        */
       /* Query q = s.createQuery("select sid,sname from Student");
        List<Object[]> li = q.list();
        for(Object[] s1 : li) {
          System.out.println(s1[0] + ":"+ s1[1]);
        }
        */
        //Query q = s.createQuery("select sname from Student where cgpa>7");
        //List<Object[]> li = q.list();
        //System.out.println(li);
        
        CriteriaBuilder cb = s.getCriteriaBuilder();
        CriteriaQuery<Student> cq = cb.createQuery(Student.class);
        Root<Statement> root = cq.from(Student.class);
        //cq.select(root);
        
        //cq.select(root).where(cb.between(root.<Integer>get("sid"),2, 4));
        
        //cq.select(root).where(cb.equal(root.get("cgpa"), 7));
        
        cq.orderBy(cb.desc(root.get("sname")));
        
        Query q = s.createQuery(cq);
        List<Student> list = q.list();
        for(Student s1 : list) {
          System.out.println(s1);
        }
        tnx.commit();
  }

}