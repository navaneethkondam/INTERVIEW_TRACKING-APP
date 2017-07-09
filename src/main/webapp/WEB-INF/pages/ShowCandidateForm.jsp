<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body {
    background-color: lightblue;
}

table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    text-align: left;
    padding: 8px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lisat Of Candidates</title>
</head>
<body>
  <table>
   <tr><th> First Name  </th>
   <th>Last Name</th>
      <th>Email ID</th>
         <th>Action</th>
         
         
   </tr>
   <c:forEach var="user" items="${users}">
				<tr>
					<td>
						${user.id}
					</td>
					<td>${user.name}</td>
					<td>${user.email}</td>
					<%-- <td><c:forEach var="framework" items="${user.framework}" varStatus="loop">
						${framework}
    					<c:if test="${not loop.last}">,</c:if>
						</c:forEach></td> --%>
					<td>
						<spring:url value="/users/${user.id}" var="userUrl" />
						<spring:url value="/users/${user.id}/delete" var="deleteUrl" /> 
						<spring:url value="/users/${user.id}/update" var="updateUrl" />

						<button class="btn btn-info" onclick="location.href='${userUrl}'">Add Interview</button>
						<button class="btn btn-primary" onclick="location.href='${updateUrl}'">Feedback</button>
						<button class="btn btn-danger" onclick="this.disabled=true;post('${deleteUrl}')">Delete</button></td>
				</tr>
			</c:forEach>
   
   
   <%-- <tr>
<td><c:out value="${candidate.id}"/></td>
        <td> <c:out value="${candidate.fname}"/></td>
        <td> <c:out value="${candidate.lname}"/></td>  
        <td> <c:out value="${candidate.email}"/></td>
         <td> <c:out value="${employee.doj}"/></td>  
        <td> <c:out value="${employee.mailid}"/></td>
   </tr> --%>
   </table>
</body>
</html>