<%-- 
    Document   : admin_driver1
    Created on : Mar 31, 2019, 3:04:29 PM
    Author     : Nichiket
--%>

<%@page import="java.util.List"%>
<%@page import="Controller.Staff"%>
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
    display: flex;
 
 

}

.butn{
    border-radius: 20px;
    justify-content: center;
    font-family: verdana;
    padding: 10px;
    padding-top: 5px;
    padding-bottom: 5px;
    border:none;
    background-color: #fff;
    cursor: pointer;

  }

.heading{
    font-size: 40px;
    font-family: impact;
    color: #000;
    text-align: center;
    padding:10px;
    text-transform: uppercase;
    letter-spacing: 3px;
    background-color: #fff;
    width:70%;
  }
  a{
    text-decoration: none;
  }

    </style>
  </head>

  <body class="main">

    <div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom box-shadow">
      <h5 class="my-0 mr-md-auto font-weight-bold">BUS MANAGER</h5>
      <nav class="my-2 my-md-0 mr-md-3">
      <a class="p-2" href="admin_home" style="text-decoration: none; color: #000; font-family: impact;">Bus search</a>
    <a class="p-2 text-dark" href="editBus_admin" style="text-decoration: none; color: #000; font-family: impact;">Change bus</a>
    <a class="p-2 text-dark" href="admin_driver2" style="text-decoration: none; color: #000; font-family: impact;">Staff-info</a>
   
    <a class="p-2" href="LogoutServlet" style="text-decoration: none; color: #000; font-family: impact;">Logout</a>
     </nav>
    </div>

<center>
<div class="table-responsive" style="width: 60%;padding-top:2%;background-color: white; border-radius: 30px;display: flex;text-align: center;flex-direction: column; margin-top: 4%;" id="view-all">
      <h1 style="padding-bottom: 2%;">All bus routes</h1>
            <table class="table table-fixed table-hover">
              <thead>
                <tr>
                  <th>Driver Name</th>
                  <th>Contact Number</th>
                  <th>Bus Number</th>
                  <th></th>
                  <th></th>
                </tr>
              </thead>
              <% List<Staff> record= (List<Staff>)request.getAttribute("List");
              for(Staff s : record){
                  
              
              
              %>
              <tbody>
                <tr>
                  <td><%= s.getName() %></td>
                  <td><%= s.getPhone() %></td>
                  <td><%= s.getBusid() %></td>
              <% } %>  
                  </tr>
                


</tbody>
</table>
</div>
<div class="card-body" style="width: 40%;" >
    
    <button class="butn" onclick="show()">Add/Delete Driver</button>
        </div>
    
    <form action="driverEdit" method="get">       
    <div class="container" style="padding-top: 5%;">
    
        <div id="add_bus" style="display: none;">
    
            <div class="card mb-4 box-shadow"><br>
    <h4> Enter the details of driver</h4>
                <div class="card-body" style="display: flex;width: 70%;flex-direction: row;justify-content: center;">
          
              <input class="form-control active-cyan-3" type="text" placeholder="Driver Name" aria-label="Search" name="dn">
              <input class="form-control active-cyan-3" type="text" placeholder="Contact No" aria-label="Search" name="pno">
              <input class="form-control active-cyan-3" type="text" placeholder="Bus No" aria-label="Search" name="bno">
        </div>           
         <button type="submit" class="butn" style="background-color: dodgerblue;padding-left: 14px;padding-right: 14px; width: 15%;margin-bottom: 2%;">Add</button>
     
    <h4>Enter the Bus Number of driver you want to delete</h4>
                <div class="card-body" style="display: flex;width: 70%;flex-direction: row;justify-content: center;">
          
              <input class="form-control active-cyan-3" type="text" placeholder="Bus No" aria-label="Search" name="del">
        </div>           
         <button type="submit" class="butn" style="background-color: dodgerblue;padding-left: 14px;padding-right: 14px; width: 15%;margin-bottom: 2%;">Delete</button>
     </div>    
        </div>
     </div></form>
<br>
    
    
</center>

<br><br>

     <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
    <script src="../../assets/js/vendor/popper.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>

    <script src="jquery.js"></script>
    <script>
     function show(){
      document.getElementById("add_bus").style.display='inline';
     }

      
    </script>
  </body>
</html>
