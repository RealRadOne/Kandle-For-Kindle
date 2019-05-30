<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Unsuccessful Login</title>
        <style>
	    body, html {
		height: 100%;
		width: 100%;
		margin: 0;
	    }
            .background {
		margin: 0;
		padding: 0;
		height: 100%;
		opacity: 0.3;
		background-size: cover;
		background-position: center;
            }
            .image {
		position: absolute;
		top: 50%;
		left: 50%;
		-ms-transform: translate(-50%, -50%);
		transform: translate(-50%, -50%);
		box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
            }
        </style>
        <script type = "text/javascript">
            <!--
                function Redirect() {
                    window.location = "Signup.html";
                }            
                setTimeout('Redirect()', 3000);
            //-->
        </script>
    </head>
    <body>
	<div>
		<img src='Assets/BackgroundUnsuccessfulSignup.png' class='background'>
        	<div class='Success'>
            		<img src='Assets/UnsuccessfulLogin3.png'class='image'>
        	</div>
	</div>
    </body>
</html>
