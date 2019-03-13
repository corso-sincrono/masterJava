<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">

	function myFunction(){
		
		var nome=document.getElementById("n").value;
    	//alert(nome);
		var xhttp=new XMLHttpRequest();
		
		xhttp.onreadystatechange = function() {
		    if (this.readyState == 4 && this.status == 200) {
		    	
		    	
		    	document.getElementById("para").innerHTML =this.responseText;
		    
		    }
		  };
		  xhttp.open("GET", "Terza?pa=" +nome, true);
		  xhttp.send();
		
		
		
	}



</script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form>
	<input type="text" id="n">
	
</form>
<button  id="b" onclick="myFunction()">INVIA</button>

<p id="para">frase</p>


</body>
</html>