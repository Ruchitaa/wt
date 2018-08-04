<%-- 
    Document   : process.jsp
    Created on : 16 Sep, 2017, 11:57:59 AM
    Author     : Sanket
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import ="java.sql.*" %>
<%
    String user = request.getParameter("username");    
    String pwd = request.getParameter("password");
   
    String email = request.getParameter("email");
    Class.forName("com.mysql.jdbc.Driver");
    try{
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user",
            "root", "");
    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into userinfo values ('" + user+ "','" + pwd + "','" + email + "')");
  
       if (i > 0) {
        //session.setAttribute("userid", user);
        response.sendRedirect("../index.html");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } 
       else
       { %><script type="text/javascript">
       alert1();
       function alert1(){
           alert("error ");
       }
       </script>
<%
           response.sendRedirect("index.html");
       }
} 
   catch(Exception e){
      %>
      <script type="text/javascript">
         
             alert("email id already exists");
             window.open("index.html","_self");
         
          </script>
      <%
 
}
%>