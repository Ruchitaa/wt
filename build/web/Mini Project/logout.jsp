<%-- 
    Document   : logout
    Created on : Oct 20, 2017, 12:05:09 PM
    Author     : Ahuja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script type="text/javascript">
    alert("logging you out");

<% session.setAttribute("username",null);
    %>
        window.open("index.jsp","_self");
        </script>

