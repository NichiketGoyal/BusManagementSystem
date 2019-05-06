/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Nichiket
 */
public class ValidateTeach {
 
    public static boolean checkUser(String id, String password){
      //boolean st=false;
     Configuration cf = null;
        SessionFactory sf = null;
        Session session = null;
        Teacher s=null;
        try{
        /*  String jdbcurl="jdbc:mysql://localhost:3306/busmanager?useSSL=false";
          String user="root";
          String pass="arrenstone";
          Class.forName("com.mysql.jdbc.Driver");
          System.out.println("connection establishing");
          Connection con=DriverManager.getConnection(jdbcurl,user,pass);
          PreparedStatement ps=con.prepareStatement("select * from teacher where id=? and  password =? ");
          ps.setString(1,id);
          ps.setString(2,password);
          ResultSet rs=ps.executeQuery();
          st=rs.next();
          */
           cf=new Configuration();
          cf.configure("student.cfg.xml");
          sf=cf.buildSessionFactory();
          session=sf.openSession();
          Transaction tf=session.beginTransaction();
          Query query=session.createQuery("from Teacher where id= :id and password = :pass ");
          query.setString("id", id);
          query.setString("pass", password);
           s=(Teacher) query.uniqueResult();
       if(s!=null){
          
          return true;
        }
      }
      catch(Exception e){
          e.printStackTrace();
      }
      return false;
  }
  
}
