<%-- 
    Document   : editBus_teach
    Created on : Apr 2, 2019, 10:46:42 AM
    Author     : Nichiket
--%>

<%@page import="java.util.List"%>
<%@page import="Controller.schedule"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">



     <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">


    <link href="prising.css" rel="stylesheet">
    <style type="text/css">
      .active-cyan-3 input[type=text] {
    border: 1px solid #4dd0e1;
    box-shadow: 0 0 0 1px #4dd0e1;
}
  .butn{
    background-color: rgba(0,0,0,.2);
    border-radius: 20px;
    width: 80%;
    cursor: pointer;
    font-family: verdana;
    padding: 10px;
    padding-top: 5px;
    padding-bottom: 5px;
    border:none;
  }
  table {
    font-family:verdana;
    font-size: 25px;
  }


    </style>
  </head>

  <body class="main">

    <div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom box-shadow">
      <h5 class="my-0 mr-md-auto font-weight-bold">BUS MANAGER</h5>
      <nav class="my-2 my-md-0 mr-md-3">
       <a class="p-2" href="teach_home.jsp" style="text-decoration: none; color: #000; font-family: impact;">Bus search</a>
    <a class="p-2 text-dark" href="editBus_teach" style="text-decoration: none; color: #000; font-family: impact;">Change bus</a>
 
    <a class="p-2" href="LogoutServlet" style="text-decoration: none; color: #000; font-family: impact;">Logout</a>
     </nav>
    </div>
    <center>
        <%System.out.println("--------------------------------------------------------------------------------->>>>>>"); %>
    <div class="table-responsive" style="width: 60%;padding-top:2%;background-color: white; border-radius: 30px;display: flex;text-align: center;flex-direction: column;">
      <h1 style="padding-bottom: 2%;">All bus routes</h1>
            <table class="table table-fixed table-hover">
              <thead>
                <tr >
                  <th>Bus Number</th>
                  <th>Source</th>
                  <th>Destination</th>
                  <th></th>

                </tr>
              </thead>
                            <% 
                List<schedule> records = (List<schedule>)request.getAttribute("List");
                System.out.println(records);
                for(schedule s: records){
                
              %>

              <tbody>
                <tr >
                  <td><%= s.getBusid() %></td>
                  <td><%= s.getSource()%></td>
                  <td><%= s.getDestination()%></td>                  
                  
                </tr>
                <% }
                %>

</tbody>
</table>
      
      

    </div>
        <br><br><br>
            
                
    <form action="add_del_busTeach" method="get">       
    <div class="container" style="padding-top: 5%;">
    
        <div id="add_bus" >
    
            <div class="card mb-4 box-shadow">
                <br>
    <h4> Enter the details of Bus you want to add</h4>
                <div class="card-body" style="display: flex;width: 70%;flex-direction: row;justify-content: center;">
          
              <input class="form-control active-cyan-3" type="text" placeholder="Bus no" aria-label="Search" name="bno">
              <input class="form-control active-cyan-3" type="text" placeholder="Enter Source" aria-label="Search" name="bs">
              <input class="form-control active-cyan-3" type="text" placeholder="Enter Destination" aria-label="Search" name="bd">
        </div>           
         <button type="submit" class="butn" style="background-color: dodgerblue;padding-left: 14px;padding-right: 14px; width: 15%;margin-bottom: 2%;">Add</button>
     
    <h4>Enter the Bus Number of Bus you want to delete</h4>
                <div class="card-body" style="display: flex;width: 70%;flex-direction: row;justify-content: center;">
          
              <input class="form-control active-cyan-3" type="text" placeholder="Bus No" aria-label="Search" name="del">
        </div>           
         <button type="submit" class="butn" style="background-color: dodgerblue;padding-left: 14px;padding-right: 14px; width: 15%;margin-bottom: 2%;">Delete</button>
     </div>    
        </div>
     </div></form>
            
</center>
</body>
</html>