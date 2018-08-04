<%-- 
    Document   : data
    Created on : Oct 14, 2017, 9:26:49 PM
    Author     : Ahuja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%String imag=(String)request.getParameter("value");
        String text=(String)request.getParameter("user_content");
        out.println(text);
         %></h1>
         <BR>
       <img src="<%=imag%>"  id="scream" alt="hello" width="50" height="50">
       
       <textarea hint="content" id="text"></textarea>
       <br>
<canvas id="myCanvas" width="500" height="500"
style="border:1px solid #d3d3d3;">
Your browser does not support the HTML5 canvas tag.
</canvas>

<script>
window.onload = function() {
    var canvas = document.getElementById("myCanvas");
    var ctx = canvas.getContext("2d");
    var img = document.getElementById("scream");
    var t=document.getElementById("te");
   ctx.drawImage(img, 10, 10);
   ctx.font = "30px Arial";
   ctx.fillText(t,10,50);
};
</script>
    </body>
</html>
