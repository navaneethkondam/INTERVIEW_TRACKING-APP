<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body {
    background-color: lightblue;
}

#divname {
    height: 700px;
    width: 600px;
    position: fixed;
    top: 26%;
    left: 35%;
    margin-top: -100px;
    margin-left: -200px;
    overflow-y: scroll;
  ::-webkit-scrollbar {
    background: transparent;  /* optional: just make scrollbar invisible */
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<div id="divname">
<table>

 <form action="register" method="post" >  
      	<tr><td>First Name :</td><td> <input type="text" name="name" PLACEHOLDER="Candidate First Name"/></td></tr> <br> 
      	<tr><td>Last Name : </td><td><input type="text" name="name" PLACEHOLDER="Candidate Last Name"/></td></tr> <br>  
       <tr><td> MailId : </td><td><input type="text" name="mailid" PLACEHOLDER=".@GMAIL.COM" /></td></tr> <br> 
        <tr><td>Feedback:</td><td>
        <textarea id = "myTextArea" rows = "3" cols = "80" PLACEHOLDER="Enter Feedback here"></textarea></td></tr><br><br>
        <tr><td> </td><td><input type="submit" value="Save" />  </td></tr>
         
       </form>
       </table>
</div>
</center>
</body>
</html>