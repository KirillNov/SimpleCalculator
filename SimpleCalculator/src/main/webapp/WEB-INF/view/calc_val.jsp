<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Dear Friend, Please enter your values</h2>
<br>
<br>

<form:form action="result" modelAttribute="calculator">
    Value one: <form:input path="valueOne"/>
    <br><br>
    Symbol: <form:select path="symbol">
    <form:option value="+"/>
    <form:option value="-"/>
    <form:option value="*"/>
    <form:option value="/"/>

</form:select>
    <br><br>
    Value two: <form:input path="valueTwo"/>
    <br><br>
    <input type="submit" value="GET RESULT">

</form:form>



</body>
</html>