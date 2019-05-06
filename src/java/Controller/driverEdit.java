/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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
@WebServlet(name = "driverEdit", urlPatterns = {"/driverEdit"})
public class driverEdit extends HttpServlet {

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
         String pno=request.getParameter("pno");
         String dn=request.getParameter("dn");
         String del=request.getParameter("del");
                         System.out.println("------------------------->>>"+bno);
                         System.out.println("------------------------->>>"+pno);
                         System.out.println("------------------------->>>"+dn);
                         System.out.println("------------------------->>>"+del);
         if(bno!=null && !bno.isEmpty() && dn!=null && !dn.isEmpty() && pno!=null && !pno.isEmpty() ){
        
             Staff sc=new Staff(bno,dn,pno);
             Staff s= (Staff)session.get(Staff.class,bno);
            if(s==null){
             session.save(sc);
            }



         }
         else if(del!=null && !del.isEmpty()){
             Object o=session.load(Staff.class, del);
             Staff sc=(Staff)o;
             

             if(sc!=null){
             session.delete(sc);
             }
         }
         tf.commit();
         session.close();
         sf.close();
         RequestDispatcher rd= request.getRequestDispatcher("admin_driver2");
       rd.forward(request,response);
        
    }

}
