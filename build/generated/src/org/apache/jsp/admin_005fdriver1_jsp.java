package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fdriver1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("     <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <link href=\"prising.css\" rel=\"stylesheet\">\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("      .active-cyan-3 input[type=text] {\n");
      out.write("    \n");
      out.write("    border: 1px solid #4dd0e1;\n");
      out.write("    box-shadow: 0 0 0 1px #4dd0e1;\n");
      out.write("    display: flex;\n");
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
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
      out.write("      <h5 class=\"my-0 mr-md-auto font-weight-bold\">BUS MANAGER</h5>\n");
      out.write("      <nav class=\"my-2 my-md-0 mr-md-3\">\n");
      out.write("        <a class=\"p-2\" href=\"admin_bus_search.html\" style=\"text-decoration: none; color: #000; font-family: impact;\">Bus search</a>\n");
      out.write("        <a class=\"p-2 text-dark\" href=\"admin_editBus.html\" style=\"text-decoration: none; color: #000; font-family: impact;\">Change bus</a>\n");
      out.write("                <a class=\"p-2 text-dark\" href=\"admin_driver.html\" style=\"text-decoration: none; color: #000; font-family: impact;\">Staff-info</a>\n");
      out.write("        <a class=\"p-2\" href=\"change_pass_admin.html\" style=\"text-decoration: none; color: #000; font-family: impact;\">Change password</a>\n");
      out.write("        <a class=\"p-2\" href=\"#\" style=\"text-decoration: none; color: #000; font-family: impact;\">Logout</a>\n");
      out.write("      </nav>\n");
      out.write("    </div>\n");
      out.write("    <center>\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("<div class=\"table-responsive\" style=\"width: 60%;padding-top:2%;background-color: white; border-radius: 30px;display: flex;align-content: center;flex-direction: column; margin-top: 4%;\" id=\"view-all\">\n");
      out.write("      <h1 style=\"padding-bottom: 2%;\">All bus routes</h1>\n");
      out.write("            <table class=\"table table-striped table-sm\">\n");
      out.write("              <thead>\n");
      out.write("                <tr>\n");
      out.write("                  <th>Driver Name</th>\n");
      out.write("                  <th>Contact Number</th>\n");
      out.write("                  <th>Bus Number</th>\n");
      out.write("                  <th></th>\n");
      out.write("                  <th></th>\n");
      out.write("                </tr>\n");
      out.write("              </thead>\n");
      out.write("              <tbody>\n");
      out.write("                <tr>\n");
      out.write("                  <td>Harsh</td>\n");
      out.write("                  <td>9814600223 </td>\n");
      out.write("                  <td>CHD111</td>\n");
      out.write("                  <td> <button class=\"butn\" style=\"background-color: dodgerblue;\">Edit</button> </td>\n");
      out.write("                  <td> <button class=\"butn\" style=\"background-color: dodgerblue;\">Delete</button> </td>\n");
      out.write("                  </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>Karan</td>\n");
      out.write("                  <td>9874563210 </td>\n");
      out.write("                  <td>CHD101</td>\n");
      out.write("                  <td> <button class=\"butn\" style=\"background-color: dodgerblue;\">Edit</button> </td>\n");
      out.write("                  <td> <button class=\"butn\" style=\"background-color: dodgerblue;\">Delete</button> </td>\n");
      out.write("                  </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>Paras</td>\n");
      out.write("                  <td>8956451220</td>\n");
      out.write("                  <td>CHD201</td>\n");
      out.write("                  <td> <button class=\"butn\" style=\"background-color: dodgerblue;\">Edit</button> </td>\n");
      out.write("                  <td> <button class=\"butn\" style=\"background-color: dodgerblue;\">Delete</button> </td>\n");
      out.write("\n");
      out.write("                  </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>Manas</td>\n");
      out.write("                  <td>9854761230 </td>\n");
      out.write("                  <td>CHD151</td>\n");
      out.write("                  <td> <button class=\"butn\" style=\"background-color: dodgerblue;\">Edit</button> </td>\n");
      out.write("                  <td> <button class=\"butn\" style=\"background-color: dodgerblue;\">Delete</button> </td>\n");
      out.write("\n");
      out.write("                  </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>Kartik</td>\n");
      out.write("                  <td>9985476210 </td>\n");
      out.write("                  <td>Chd135</td>\n");
      out.write("                  <td> <button class=\"butn\" style=\"background-color: dodgerblue;\">Edit</button> </td>\n");
      out.write("                  <td> <button class=\"butn\" style=\"background-color: dodgerblue;\">Delete</button> </td>\n");
      out.write("\n");
      out.write("                  </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td>Fury</td>\n");
      out.write("                  <td>9658741230 </td>\n");
      out.write("                  <td>PKL215</td>\n");
      out.write("                  <td> <button class=\"butn\" style=\"background-color: dodgerblue;\">Edit</button> </td>\n");
      out.write("                  <td> <button class=\"butn\" style=\"background-color: dodgerblue;\">Delete</button> </td>                   </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("<div class=\"card-body\" style=\"width: 40%;\" >\n");
      out.write("        <button class=\"butn\" onclick=\"show()\">Add Bus/Driver</button>\n");
      out.write("        </div>\n");
      out.write("           <div class=\"container\" style=\"padding-top: 5%;\">\n");
      out.write("     <div id=\"add_bus\" style=\"display: none;\">\n");
      out.write("     <div class=\"card mb-4 box-shadow\">\n");
      out.write("          <div class=\"card-body\" style=\"display: flex;width: 70%;flex-direction: row;justify-content: center;\">\n");
      out.write("          \n");
      out.write("          <input class=\"form-control active-cyan-3\" type=\"text\" placeholder=\"Driver Name\" aria-label=\"Search\">\n");
      out.write("          <input class=\"form-control active-cyan-3\" type=\"text\" placeholder=\"Contact No\" aria-label=\"Search\">\n");
      out.write("            <input class=\"form-control active-cyan-3\" type=\"text\" placeholder=\"Bus No\" aria-label=\"Search\">\n");
      out.write("        </div>           \n");
      out.write("        <button class=\"butn\" style=\"background-color: dodgerblue;padding-left: 14px;padding-right: 14px; width: 15%;margin-bottom: 2%;\">Add</button>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("<br><br>\n");
      out.write("\n");
      out.write("     <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script>window.jQuery || document.write('<script src=\"../../assets/js/vendor/jquery-slim.min.js\"><\\/script>')</script>\n");
      out.write("    <script src=\"../../assets/js/vendor/popper.min.js\"></script>\n");
      out.write("    <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"jquery.js\"></script>\n");
      out.write("    <script>\n");
      out.write("     function show(){\n");
      out.write("      document.getElementById(\"add_bus\").style.display='inline';\n");
      out.write("     }\n");
      out.write("\n");
      out.write("      \n");
      out.write("    </script>\n");
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
