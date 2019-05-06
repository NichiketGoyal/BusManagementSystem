
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        String id=request.getParameter("id");
        String pass=request.getParameter("psw");
        String user=request.getParameter("SFA");
        int Id=Integer.parseInt(id);
        HttpSession session = request.getSession();
        session.setAttribute("uid",Id);
        
        
        System.out.println(user);
        if(user.equals("Student")){
            if(Validate.checkUser(id, pass)){
                
                RequestDispatcher rd= request.getRequestDispatcher("student_home.jsp");
               rd.forward(request,response);

            }
            else{
                System.out.println("Something is incorect");
                RequestDispatcher rd= request.getRequestDispatcher("index.html");
               rd.forward(request,response);
            }
        }
        else if(user.equals("Faculty")){
            if(ValidateTeach.checkUser(id, pass)){
               RequestDispatcher rd= request.getRequestDispatcher("teach_home.jsp");
               rd.forward(request,response); 
            }
            else{
                
                System.out.println("Something is incorect");
                RequestDispatcher rd= request.getRequestDispatcher("index.html");
               rd.forward(request,response);
            }
        }
        else{
        if(user.equals("Admin")&& pass.equals("qwerty")){
            RequestDispatcher rd= request.getRequestDispatcher("admin_home.jsp");
               rd.forward(request,response);        }
        else{ System.out.println("Something is incorect");
                RequestDispatcher rd= request.getRequestDispatcher("index.html");
               rd.forward(request,response);}
        }
        
    }

}
