<%-- 
    Document   : teach_home
    Created on : Apr 2, 2019, 9:45:10 AM
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
      <h5 class="my-0 mr-md-auto font-weight-bold" ">BUS MANAGER</h5>
      <nav class="my-2 my-md-0 mr-md-3">
    <a class="p-2" href="teach_home.jsp" style="text-decoration: none; color: #000; font-family: impact;">Bus search</a>
    <a class="p-2 text-dark" href="editBus_teach" style="text-decoration: none; color: #000; font-family: impact;">Change bus</a>
    <a class="p-2" href="LogoutServlet" style="text-decoration: none; color: #000; font-family: impact;">Logout</a>
      </nav>
    </div>
    <center>
<h2 class="heading">Search Bus using route or by Bus Number</h2></center>

   <div class="container" style="padding-top: 5%;width: 35%;">
       <div class="card-deck mb-3 text-center" >
     <div class="card mb-4 box-shadow">
         <form action="teacher_home" method="get" ><center>
             <div class="card-header" style="padding-top: 5%;">
             <div class="active-cyan-3 active-cyan-4 mb-4" style="width: 60%;">
            <input class="form-control" type="text" name="city" placeholder="Enter place or bus number" aria-label="Search" id="find1">
             </div>
          </div>
          <div class="card-body" >
            <button type="submit" class="btn btn-lg btn-block btn-primary" style="color:#fff;width: 60%;">Search</button>
    
          </div>
    </center>
     </form>     
     </div>
             
        </div>
        

   </div>
  <center>

              <% 
                List<schedule> records = (List<schedule>)request.getAttribute("List");
                String find1=(String)request.getAttribute("find1");
                int flag=0;
                if(find1 != null && !find1.isEmpty() && records!=null)
                {for(schedule s: records){
                if(find1.equalsIgnoreCase(s.getBusid()) ||find1.equalsIgnoreCase(s.getSource())||find1.equalsIgnoreCase(s.getDestination()) ){
                    if(flag==0){
              %>
  <div class="table-responsive" style="width: 60%;padding-top:2%;background-color: white; border-radius: 30px;text-align: center;flex-direction: column;" id="view-all">
            <table class="table table-fixed table-hover">
              <thead>
                <tr>
                  <th>Bus Number</th>
                  <th>Source</th>
                  <th>Destination</th>
                  
                </tr>
              </thead>
              <% flag=1;
                    }%>
              <tbody>
                
                 <tr>
                     <td><%= s.getBusid() %></td>
                  <td><%= s.getSource()%></td>
                  <td><%= s.getDestination()%></td>
                  
                  </tr>
</tbody>
</table>
  </div>  

                  <%
                }}
                }%>      
       
  </center>
   <center>
<div class="card-body" style="width: 40%;" >
    <form action="teacher_home" method="get">
        <button type="submit" class="butn" onclick="show()">View all bus</button>
    </form>
</div>
        </center>
</div>
  
<center>
    <% 
                records = (List<schedule>)request.getAttribute("List1");
                flag=0;
                if(records!=null){    
                System.out.println(records);
                
                %>
<div class="table-responsive" style="width: 60%;padding-top:2%;background-color: white; border-radius: 30px;text-align: center;flex-direction: column;" id="view-all">
      <h1 style="padding-bottom: 2%;">All bus routes</h1>
            <table class="table table-fixed table-hover">
                <%if(flag==0){flag=1; %>
                <thead>
                <tr>
                  <th>Bus Number</th>
                  <th>Source</th>
                  <th>Destination</th>
                  
                </tr>
              </thead><%}
              for(schedule s: records){%>
              <tbody>
                
                 <tr>
                     <td><%= s.getBusid() %></td>
                  <td><%= s.getSource()%></td>
                  <td><%= s.getDestination()%></td>
                  
                  </tr>
                  <%}}
                  %>
                  
                


</tbody>
</table>
</div>
</center>



     <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
    <script src="../../assets/js/vendor/popper.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script src="../../assets/js/vendor/holder.min.js"></script>
    <script src="jquery.js"></script>
    <script>
/*      function busDetail(){
         document.getElementById('view-all').style.display='flex';
      
        var str="driver: " ;var st ="<br> route : " ;
        document.getElementById("bus_r").innerHTML=str+st;
        document.getElementsByClassName('container').style.paddingTop="5% ";
      }

      function show(){
        document.getElementById('view-all').style.display='flex';
      }
*/
      
    </script>
    
  </body>
</html>
