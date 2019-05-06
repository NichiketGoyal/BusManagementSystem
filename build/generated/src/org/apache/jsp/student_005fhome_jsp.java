package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Controller.schedule;

public final class student_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"prising.css\" rel=\"stylesheet\">\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("      .active-cyan-3 input[type=text] {\n");
      out.write("    border: 1px solid #4dd0e1;\n");
      out.write("    box-shadow: 0 0 0 1px #4dd0e1;\n");
      out.write("}\n");
      out.write(".butn{\n");
      out.write("    border-radius: 20px;\n");
      out.write("    justify-content: center;\n");
      out.write("    font-family: verdana;\n");
      out.write("    padding: 10px;\n");
      out.write("    padding-top: 5px;\n");
      out.write("    padding-bottom: 5px;\n");
      out.write("    border:none;\n");
      out.write("    background-color: #fff;\n");
      out.write("    cursor: pointer;\n");
      out.write("\n");
      out.write("  }\n");
      out.write("\n");
      out.write(".heading{\n");
      out.write("    font-size: 40px;\n");
      out.write("    font-family: impact;\n");
      out.write("    color: #000;\n");
      out.write("    text-align: center;\n");
      out.write("    padding:10px;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    letter-spacing: 3px;\n");
      out.write("    background-color: #fff;\n");
      out.write("    width:70%;\n");
      out.write("  }\n");
      out.write("  a{\n");
      out.write("    text-decoration: none;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body class=\"main\">\n");
      out.write("\n");
      out.write("    <div class=\"d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom box-shadow\">\n");
      out.write("      <h5 class=\"my-0 mr-md-auto font-weight-bold\" \">BUS MANAGER</h5>\n");
      out.write("      <nav class=\"my-2 my-md-0 mr-md-3\">\n");
      out.write("        <a class=\"p-2\" href=\"student_home.jsp\" style=\"text-decoration: none; color: #000; font-family: impact;\">Home</a>\n");
      out.write("        <a class=\"p-2\" href=\"LogoutServlet\" style=\"text-decoration: none; color: #000; font-family: impact;\">Logout</a>\n");
      out.write("      </nav>\n");
      out.write("    </div>\n");
      out.write("    <center>\n");
      out.write("<h2 class=\"heading\">Search Bus using route or by Bus Number</h2></center>\n");
      out.write("\n");
      out.write("   <div class=\"container\" style=\"padding-top: 5%;width: 35%;\">\n");
      out.write("       <div class=\"card-deck mb-3 text-center\" >\n");
      out.write("     <div class=\"card mb-4 box-shadow\">\n");
      out.write("         <form action=\"Student_bus\" method=\"get\" ><center>\n");
      out.write("             <div class=\"card-header\" style=\"padding-top: 5%;\">\n");
      out.write("             <div class=\"active-cyan-3 active-cyan-4 mb-4\" style=\"width: 60%;\">\n");
      out.write("            <input class=\"form-control\" type=\"text\" name=\"city\" placeholder=\"Enter place or bus number\" aria-label=\"Search\" id=\"find1\">\n");
      out.write("             </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"card-body\" >\n");
      out.write("            <button type=\"submit\" class=\"btn btn-lg btn-block btn-primary\" style=\"color:#fff;width: 60%;\">Search</button>\n");
      out.write("    \n");
      out.write("          </div>\n");
      out.write("    </center>\n");
      out.write("     </form>     \n");
      out.write("     </div>\n");
      out.write("             \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("   </div>\n");
      out.write("  <center>\n");
      out.write("\n");
      out.write("              ");
 
                List<schedule> records = (List<schedule>)request.getAttribute("List");
                String find1=(String)request.getAttribute("find1");
                int flag=0;
                if(find1 != null && !find1.isEmpty() && records!=null)
                {for(schedule s: records){
                if(find1.equalsIgnoreCase(s.getBusid()) ||find1.equalsIgnoreCase(s.getSource())||find1.equalsIgnoreCase(s.getDestination()) ){
                    if(flag==0){
              
      out.write("\n");
      out.write("  <div class=\"table-responsive\" style=\"width: 60%;padding-top:2%;background-color: white; border-radius: 30px;align-content: center;flex-direction: column;\" id=\"view-all\">\n");
      out.write("            <table class=\"table table-fixed\">\n");
      out.write("              <thead>\n");
      out.write("                <tr>\n");
      out.write("                  <th>Bus Number</th>\n");
      out.write("                  <th>Source</th>\n");
      out.write("                  <th>Destination</th>\n");
      out.write("                  \n");
      out.write("                </tr>\n");
      out.write("              </thead>\n");
      out.write("              ");
 flag=1;
                    }
      out.write("\n");
      out.write("              <tbody>\n");
      out.write("                \n");
      out.write("                 <tr>\n");
      out.write("                     <td>");
      out.print( s.getBusid() );
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( s.getSource());
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( s.getDestination());
      out.write("</td>\n");
      out.write("                  \n");
      out.write("                  </tr>\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("  </div>  \n");
      out.write("\n");
      out.write("                  ");

                }}
                }
      out.write("      \n");
      out.write("       \n");
      out.write("  </center>\n");
      out.write("   <center>\n");
      out.write("<div class=\"card-body\" style=\"width: 40%;\" >\n");
      out.write("    <form action=\"Student_bus\" method=\"get\">\n");
      out.write("        <button type=\"submit\" class=\"butn\" onclick=\"show()\">View all bus</button>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("        </center>\n");
      out.write("</div>\n");
      out.write("  \n");
      out.write("<center>\n");
      out.write("    ");
 
                records = (List<schedule>)request.getAttribute("List1");
                flag=0;
                if(records!=null){    
                System.out.println(records);
                
                
      out.write("\n");
      out.write("<div class=\"table-responsive\" style=\"width: 60%;padding-top:2%;background-color: white; border-radius: 30px;align-content: center;flex-direction: column;\" id=\"view-all\">\n");
      out.write("      <h1 style=\"padding-bottom: 2%;\">All bus routes</h1>\n");
      out.write("            <table class=\"table table-striped table-sm\">\n");
      out.write("                ");
if(flag==0){flag=1; 
      out.write("\n");
      out.write("                <thead>\n");
      out.write("                <tr>\n");
      out.write("                  <th>Bus Number</th>\n");
      out.write("                  <th>Source</th>\n");
      out.write("                  <th>Destination</th>\n");
      out.write("                  \n");
      out.write("                </tr>\n");
      out.write("              </thead>");
}
              for(schedule s: records){
      out.write("\n");
      out.write("              <tbody>\n");
      out.write("                \n");
      out.write("                 <tr>\n");
      out.write("                     <td>");
      out.print( s.getBusid() );
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( s.getSource());
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( s.getDestination());
      out.write("</td>\n");
      out.write("                  \n");
      out.write("                  </tr>\n");
      out.write("                  ");
}}
                  
      out.write("\n");
      out.write("                  \n");
      out.write("                \n");
      out.write("\n");
      out.write("\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("     <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script>window.jQuery || document.write('<script src=\"../../assets/js/vendor/jquery-slim.min.js\"><\\/script>')</script>\n");
      out.write("    <script src=\"../../assets/js/vendor/popper.min.js\"></script>\n");
      out.write("    <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"../../assets/js/vendor/holder.min.js\"></script>\n");
      out.write("    <script src=\"jquery.js\"></script>\n");
      out.write("    <script>\n");
      out.write("/*      function busDetail(){\n");
      out.write("         document.getElementById('view-all').style.display='flex';\n");
      out.write("      \n");
      out.write("        var str=\"driver: \" ;var st =\"<br> route : \" ;\n");
      out.write("        document.getElementById(\"bus_r\").innerHTML=str+st;\n");
      out.write("        document.getElementsByClassName('container').style.paddingTop=\"5% \";\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      function show(){\n");
      out.write("        document.getElementById('view-all').style.display='flex';\n");
      out.write("      }\n");
      out.write("*/\n");
      out.write("      \n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("  </body>\n");
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
