<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script language="javascript" type="text/javascript">
	   var request = false;
	try {
		request = new XMLHttpRequest();
	} catch (trymicrosoft) {
		try {
			request = new ActiveXObject("Msxml2.XMLHTTP");
		} catch (othermicrosoft) {
			try {
				request = new ActiveXObject("Microsoft.XMLHTTP");
			} catch (failed) {
				request = false;
			}
		}
	}

	if (!request)
		alert("Error initializing XMLHttpRequest!");

	function getCustomerInfo() {
		var phone = document.getElementById("phone").value;
		var url = "ajax/test.jsp?phone=" + escape(phone);
		request.open("GET", url, true);
		request.onreadystatechange = updatePage;
		request.send(null);
	}

	function updatePage() {
		 if (request.readyState == 4) {
	       if (request.status == 200) {
	         var response = request.responseText.split("|");
	         document.getElementById("order").value = response[0];
	         document.getElementById("address").innerHTML =
	           response[1].replace(/\n/g, "");
	       } else
	         alert("status is " + request.status);
	     }
	}
</script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
	<p>
		<img src="breakneck-logo_4c.gif" alt="Break Neck Pizza" />
	</p>
	<form action="POST">
		<p>
			Enter your phone number:<input type="text" size="14" name="phone" id="phone" onChange="getCustomerInfo();" />
		</p>
		   
		<p>Your order will be delivered to:</p>
		   
		<div id="address">
			
		</div>
		   
		<p>Type your order in here:</p>
		   
		<p>
			<textarea name="order" rows="6" cols="50" id="order"></textarea>
		</p>
		   
		<p>
			<input type="submit" value="Order Pizza" id="submit" />
		</p>
		  
	</form>
</body>
</html>
