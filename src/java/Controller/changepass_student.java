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
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Nichiket
 */
@WebServlet(name = "changepass_student", urlPatterns = {"/changepass_student"})
public class changepass_student extends HttpServlet {

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
         String op=request.getParameter("op");
         String np=request.getParameter("np");
         System.out.println("------------>>>>>>>>>>>>>>>>>>"+ op);
         System.out.println("------------>>>>>>>>>>>>>>>>>>"+ np);
       int uid= (int)request.getSession().getAttribute("uid");
       
       Student ns = (Student)session.get(Student.class,uid);
       if(ns != null){
           
           System.out.println("main if");
           if(ns.getPassword().equalsIgnoreCase(op)){
               System.out.println("sub if");
               ns.setPassword(np);
               session.update(ns);
           }
       }
       
       tf.commit();
       session.close();
       sf.close();
         RequestDispatcher rd= request.getRequestDispatcher("change_pass.html");
               rd.forward(request,response);
       
    }

    
}
