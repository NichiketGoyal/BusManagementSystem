<%-- 
    Document   : Changepass_student
    Created on : Apr 2, 2019, 2:41:05 PM
    Author     : Nichiket
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

    </style>
  </head>

  <body class="main">

    <div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom box-shadow">
      <h5 class="my-0 mr-md-auto font-weight-bold" ">BUS MANAGER</h5>
      <nav class="my-2 my-md-0 mr-md-3">
        <a class="p-2" href="nav.html" style="text-decoration: none; color: #000; font-family: impact;">Home</a>
        <a class="p-2" href="change_pass.html" style="text-decoration: none; color: #000; font-family: impact;">Change password</a>
        <a class="p-2" href="#" style="text-decoration: none; color: #000; font-family: impact;">Logout</a>
      </nav>
      </nav>
    </div>


     <div class="container" style="padding-top: 10%; width: 40%">
     <div class="card-deck mb-3 text-center">
     <div class="card mb-4 box-shadow">
          <div class="card-header">
            <h4 class="my-0 font-weight-normal">Change password</h4>
          </div>
         <form action="changepass_student" method="get">
          <div class="card-body">
            <div class="active-cyan-3 active-cyan-4 mb-4">
            <input id="op" class="form-control" type="text" placeholder="Enter Old Password" aria-label="Search" required name="op">
            <br>
            <input id="np" class="form-control" type="text" placeholder="Enter New Password" aria-label="Search" required name="np">
            <br>
            <input id="cp" class="form-control" type="text" placeholder="Re Enter New Password" aria-label="Search" required>
            </div>
            <button type="submit" class="btn btn-lg btn-block btn-outline-primary" style="border: 1px solid #4dd0e1;
    box-shadow: 0 0 0 1px #4dd0e1;color:#4dd0e1" onclick="change()">Change</button>
    
          </div>
         </form>
        </div>

</div>
</div>
<script type="text/javascript">
  function change(){
    var x=document.getElementById('op').value;
    var y=document.getElementById('np').value;
    var z=document.getElementById('cp').value;
    if(x==''){
      alert("enter old password");
    }
    else if(y==''){
      alert("enter new password");
    } 
    else{
    if(y==z){
      alert("Password Changed");
    }
    else{
      alert("new password does not match reentered password");
    }}
  }
</script>
</body>
</html>


<% /*

login servlet
HttpSession session = request.getSession();
session.setAttribute("uname",name);
session.setAttribute("upwd",pwd);






request.getSession().getAttribute("uname");*/
%>