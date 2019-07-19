<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>User Login Page</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" >
        
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="Login.css" rel="stylesheet" type="text/css"/>
</head>
<body>
	<div class="container h-100">
		<div class="d-flex justify-content-center h-100">
			<div class="user_card">
				<div class="d-flex justify-content-center">
					<div class="brand_logo_container">
                                          
						<img src=  "images/logo.jpg"  class="brand_logo" alt="Logo">
					</div>
				</div>
				<div class="d-flex justify-content-center form_container">
				
               <form action="showPhone" method="get">
						<div class="input-group mb-3">
							<div class="input-group-append">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input type="text" name="AadharCardNo" class="form-control input_user"  placeholder="Enter Aadhar Card No">
						</div>
						
						<%
								 if(null!=request.getAttribute("errorMessage"))
									 {
									 out.println( request.getAttribute("errorMessage")); 
									 }
						
						 %>		
                 <div class="d-flex justify-content-center mt-3 login_container">
                 <input type="submit" name="Next" class="btn login_btn" value="Next"> 
                 <!--   <button name="Next" class="btn login_btn">submit</button> -->
				</div>
					</form> 
					 
			<!-- 	<form action="UserVerify" method="get">
				<input type="text" name="name">
				<<input type="submit" name="Next" class="btn login_btn" value="Next"> >
				</form>
				 -->
				</div>
					
			</div>
		</div>
	</div>
</body>
</html></html>