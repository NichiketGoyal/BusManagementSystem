/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package display;

import Controller.Userdaoo;
import Controller.schedule;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Nichiket
 */
@WebServlet(name = "add_del_bus", urlPatterns = {"/add_del_bus"})
public class add_del_bus extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         Configuration cf=new Configuration();
         cf.configure("student.cfg.xml");
        SessionFactory  sf=cf.buildSessionFactory();
         Session session=sf.openSession();
         Transaction tf=session.beginTransaction();
         String bno=request.getParameter("bno");
         String bs=request.getParameter("bs");
         String bd=request.getParameter("bd");
         String del=request.getParameter("del");
                         System.out.println("------------------------->>>"+bno);
                         System.out.println("------------------------->>>"+bs);
                         System.out.println("------------------------->>>"+bd);
                         System.out.println("------------------------->>>"+del);
         if(bno!=null && !bno.isEmpty() && bs!=null && !bs.isEmpty() && bd!=null && !bd.isEmpty()   ){
        
             
             schedule sc=new schedule(bno,bd,bs);
             /*sc.setBusid(bno);
             sc.setDestination(bd);
             sc.setSource(bs);
         Userdaoo udd= new Userdaoo();
         udd.check(sc);*/
            schedule s= (schedule)session.get(schedule.class,bno);
            if(s==null){
             session.save(sc);
            }
         }
         else if(del!=null && !del.isEmpty()){
             /*Object o=session.load(schedule.class, del);
             schedule sc=(schedule)o;
             session.delete(sc);
             */
             
             schedule s= (schedule)session.get(schedule.class,del);
            if(s==null){
             schedule sc=new schedule();
             sc.setBusid(del);
             session.delete(sc);            }

         }
         tf.commit();
         session.close();
         sf.close();
         RequestDispatcher rd= request.getRequestDispatcher("editBus_admin");
       rd.forward(request,response);
         
    }

    
}
