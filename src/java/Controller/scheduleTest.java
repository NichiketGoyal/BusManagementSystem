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
public class scheduleTest {
    public static void main(String[] x){
        schedule s=null;
        Configuration cf=null;
        SessionFactory sf=null;
        Session session=null;
     
     try{
         cf=new Configuration();
         cf.configure("bus.cfg.xml");
         sf=cf.buildSessionFactory();
         session=sf.openSession();
         Transaction tf=session.beginTransaction();
         s=new schedule("BN301","Kharar","University");
         session.save(s);/*
         s=new schedule("BN103","Panchkula","University");
         session.save(s);
         s=new schedule("BN201","Zirakpur","University");
         session.save(s);
         s=new schedule("BN203","Mohali","University");
         session.save(s);
         s=new schedule("BN105","Pinjore","University");
         session.save(s);
         s=new schedule("BN205","Ambala","University");
         session.save(s);
         s=new schedule("BN300","Nalagarh","University");
         session.save(s);*/
         tf.commit();
     }catch( Exception ee){
        ee.printStackTrace();
     }finally{
         session.close();
         sf.close();
     }
     System.out.println("Success");
     }
}
    
