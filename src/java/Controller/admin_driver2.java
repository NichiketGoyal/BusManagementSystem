/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "admin_driver2", urlPatterns = {"/admin_driver2"})
public class admin_driver2 extends HttpServlet {

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
         PrintWriter out=response.getWriter();
        
        Configuration cf=new Configuration();
         cf.configure("student.cfg.xml");
        SessionFactory  sf=cf.buildSessionFactory();
         Session session=sf.openSession();
         Transaction tf=session.beginTransaction();
        

        Query query=session.createQuery("from Staff");
        List<Staff> records = query.list();
        
        System.out.println("chk1-----------------------"+records);
         
        request.setAttribute("List", records);
        
       RequestDispatcher rd= request.getRequestDispatcher("admin_driver1.jsp");
       rd.forward(request,response);
    }


}
