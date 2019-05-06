package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Controller.schedule;

public final class editBus_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("     <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <link href=\"prising.css\" rel=\"stylesheet\">\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("      .active-cyan-3 input[type=text] {\n");
      out.write("    border: 1px solid #4dd0e1;\n");
      out.write("    box-shadow: 0 0 0 1px #4dd0e1;\n");
      out.write("}\n");
      out.write("  .butn{\n");
      out.write("    background-color: rgba(0,0,0,.2);\n");
      out.write("    border-radius: 20px;\n");
      out.write("    width: 80%;\n");
      out.write("    cursor: pointer;\n");
      out.write("    font-family: verdana;\n");
      out.write("    padding: 10px;\n");
      out.write("    padding-top: 5px;\n");
      out.write("    padding-bottom: 5px;\n");
      out.write("    border:none;\n");
      out.write("  }\n");
      out.write("  table {\n");
      out.write("    font-family:verdana;\n");
      out.write("    font-size: 25px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body class=\"main\">\n");
      out.write("\n");
      out.write("    <div class=\"d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom box-shadow\">\n");
      out.write("      <h5 class=\"my-0 mr-md-auto font-weight-bold\">BUS MANAGER</h5>\n");
      out.write("      <nav class=\"my-2 my-md-0 mr-md-3\">\n");
      out.write("       <a class=\"p-2\" href=\"admin_home\" style=\"text-decoration: none; color: #000; font-family: impact;\">Bus search</a>\n");
      out.write("    <a class=\"p-2 text-dark\" href=\"editBus_admin\" style=\"text-decoration: none; color: #000; font-family: impact;\">Change bus</a>\n");
      out.write("    <a class=\"p-2 text-dark\" href=\"admin_driver2\" style=\"text-decoration: none; color: #000; font-family: impact;\">Staff-info</a>\n");
      out.write("    \n");
      out.write("    <a class=\"p-2\" href=\"LogoutServlet\" style=\"text-decoration: none; color: #000; font-family: impact;\">Logout</a>\n");
      out.write("     </nav>\n");
      out.write("    </div>\n");
      out.write("    <center>\n");
      out.write("        ");
System.out.println("--------------------------------------------------------------------------------->>>>>>"); 
      out.write("\n");
      out.write("    <div class=\"table-responsive\" style=\"width: 60%;padding-top:2%;background-color: white; border-radius: 30px;display: flex;text-align: center;flex-direction: column;\">\n");
      out.write("      <h1 style=\"padding-bottom: 2%;\">All bus routes</h1>\n");
      out.write("            <table class=\"table table-fixed table-hover\">\n");
      out.write("              <thead>\n");
      out.write("                <tr >\n");
      out.write("                  <th>Bus Number</th>\n");
      out.write("                  <th>Source</th>\n");
      out.write("                  <th>Destination</th>\n");
      out.write("                  <th></th>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("              </thead>\n");
      out.write("                            ");
 
                List<schedule> records = (List<schedule>)request.getAttribute("List");
                System.out.println(records);
                for(schedule s: records){
                
              
      out.write("\n");
      out.write("\n");
      out.write("              <tbody>\n");
      out.write("                <tr >\n");
      out.write("                  <td>");
      out.print( s.getBusid() );
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( s.getSource());
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( s.getDestination());
      out.write("</td>                  \n");
      out.write("                  \n");
      out.write("                </tr>\n");
      out.write("                ");
 }
                
      out.write("\n");
      out.write("\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("        <br><br><br>\n");
      out.write("            \n");
      out.write("            <form action=\"add_del_bus\" method=\"get\">       \n");
      out.write("    <div class=\"container\" style=\"padding-top: 5%;\">\n");
      out.write("    \n");
      out.write("        <div id=\"add_bus\" >\n");
      out.write("    \n");
      out.write("            <div class=\"card mb-4 box-shadow\">\n");
      out.write("    <h4> Enter the details of Bus you want to add</h4>\n");
      out.write("                <div class=\"card-body\" style=\"display: flex;width: 70%;flex-direction: row;justify-content: center;\">\n");
      out.write("          \n");
      out.write("              <input class=\"form-control active-cyan-3\" type=\"text\" placeholder=\"Bus no\" aria-label=\"Search\" name=\"bno\">\n");
      out.write("              <input class=\"form-control active-cyan-3\" type=\"text\" placeholder=\"Enter Source\" aria-label=\"Search\" name=\"bs\">\n");
      out.write("              <input class=\"form-control active-cyan-3\" type=\"text\" placeholder=\"Enter Destination\" aria-label=\"Search\" name=\"bd\">\n");
      out.write("        </div>           \n");
      out.write("         <button type=\"submit\" class=\"butn\" style=\"background-color: dodgerblue;padding-left: 14px;padding-right: 14px; width: 15%;margin-bottom: 2%;\">Add</button>\n");
      out.write("     \n");
      out.write("    <h4>Enter the Bus Number of Bus you want to delete</h4>\n");
      out.write("                <div class=\"card-body\" style=\"display: flex;width: 70%;flex-direction: row;justify-content: center;\">\n");
      out.write("          \n");
      out.write("              <input class=\"form-control active-cyan-3\" type=\"text\" placeholder=\"Bus No\" aria-label=\"Search\" name=\"del\">\n");
      out.write("        </div>           \n");
      out.write("         <button type=\"submit\" class=\"butn\" style=\"background-color: dodgerblue;padding-left: 14px;padding-right: 14px; width: 15%;margin-bottom: 2%;\">Delete</button>\n");
      out.write("     </div>    \n");
      out.write("        </div>\n");
      out.write("     </div></form>\n");
      out.write("</center>\n");
      out.write("  <br><br>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
