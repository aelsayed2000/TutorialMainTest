<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <title>Hello World Example</title>
</head>
<body>
    <h1>Hello World Example</h1>
    
<s:form action="updateSports">
    <s:textfield name="newSport" label="New Sport" />
    <s:submit value="Add Sport" />
</s:form>


<h2>Sports List:</h2>
<s:iterator value="sports">
    <s:property />
    <br />
</s:iterator>


</body>
</html>
