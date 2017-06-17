<%-- 
    Document   : mobileHome
    Created on : Jun 17, 2017, 8:14:38 AM
    Author     : Rob Garcia at rgarcia92.student.umuc.edu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>CMSC 495 Electronic Medical Reference Project</title>
    <link href="${pageContext.request.contextPath}/css/mobileStyle.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<header>
    <h1>CMSC 495 Electronic Medical Reference Project</h1>
    <h2>Current as of 2017</h2>
</header>
<main>
    <form action="${pageContext.request.contextPath}/mobileKeypad.jsp" method="post">
        <table class="keypad">
            <tr>
                <!-- h1 only renders properly with css -->
                <td class="keys"><button type="submit" name="button" value="1">Look Up Medications by Name</button></td>
            </tr>
            <tr>
                <td class="keys"><button type="submit" name="button" value="2">Look Up Medications by Condition</button></td>
            </tr>
        </table>
    </form>
</main>
</body>
</html>