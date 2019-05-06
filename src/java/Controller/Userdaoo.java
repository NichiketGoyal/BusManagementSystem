/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Nichiket
 */
public class Userdaoo {
    public boolean check(schedule sc){
        schedule db=null;
        Configuration cf=new Configuration();
         cf.configure("student.cfg.xml");
        SessionFactory  sf=cf.buildSessionFactory();
         Session session=sf.openSession();
         Transaction tf=session.beginTransaction();
         session.save(sc);
         tf.commit();
         session.close();
         sf.close();
        if(db==null){
            return false;
        }
        else{
            return sc.equals(db);
        }
    }
    
}
