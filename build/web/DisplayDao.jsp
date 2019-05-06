<%-- 
    Document   : DisplayDao
    Created on : Mar 26, 2019, 9:29:24 AM
    Author     : Nichiket
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Student Information</h1>
        <table>
            <tr>
                <th>Name</th>
                <th>Id</th>
                <th>Marks</th>                
            </tr>
            <%
            List<Sudent> records=request.getAttribute("List");
            for(Student s : records){
            
            %>
            <tr>
                <td><%= s.getName() %></td>
                <td><%= s.getId() %></td>
                <td><%= s.getMarks() %></td>
                
                
            </tr>
            <% }%>
        </table>
            
    </body>
</html>
