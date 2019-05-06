
package Controller;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {
 public static void main(String[] x){
     
     Staff s=null;
     Scanner sc=new Scanner("System.in");
     Configuration cf=null;
     SessionFactory sf=null;
     Session session=null;
     
     try{
         cf=new Configuration();
         cf.configure("student.cfg.xml");
         sf=cf.buildSessionFactory();
         session=sf.openSession();
         Transaction tf=session.beginTransaction();
         
         s=new Staff("BN102","Raman","8546712340");
         session.save(s);
         s=new Staff("BN103","Chinu","8546717340");
         session.save(s);
         s=new Staff("BN201","Kunal","8546717440");
         session.save(s);
         s=new Staff("BN203","Aman","8546712960");
         session.save(s);   
         s=new Staff("BN105","Daman","8546142340");
         session.save(s);    
         s=new Staff("BN205","Shubham","8546892340");
         session.save(s);
         s=new Staff("BN300","Karan","8546713340");
         session.save(s);
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
