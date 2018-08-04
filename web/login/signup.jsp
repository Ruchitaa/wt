<%-- 
    Document   : signup
    Created on : 16 Sep, 2017, 1:22:18 PM
    Author     : Sanket
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ page import ="java.sql.*" %>
<%
    String userid = request.getParameter("username");    
    String pwd = request.getParameter("password");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user",
            "root", "");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from userinfo where username='" + userid + "' and pwd='" + pwd + "'");
    if (rs.next()) {
        session.setAttribute("username", userid);
        //out.println("welcome " + userid);
        //out.println("<a href='logout.jsp'>Log out</a>");
        response.sendRedirect("../Mini%20Project/index.jsp");
    } else {
        
        %>
        <script type="text/javascript">
            alert1();
            function alert1(){
                alert("inavlid username or password");
                window.open("index.html","_self");
               
            }
        </script>
        <%
       
    }
%>
    </body>
</html>
