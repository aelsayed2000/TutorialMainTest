<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <title>Hello World Example</title>
</head>
<body>
    <h1>Hello World Example</h1>
    
    <s:form action="helloWorld">
        <s:textfield name="personBean.name" label="Name" value="%{personBean.name}" />
        <s:textfield name="personBean.sport" label="Sport" value="%{personBean.sport}" />
        <s:submit value="Submit" />
    </s:form>

    <!-- Display validation errors -->
    <s:fielderror fieldName="personBean.name" />
    <s:fielderror fieldName="personBean.sport" />

    <h2>Sports List:</h2>
    <s:iterator value="sports">
        <s:property />
        <br />
    </s:iterator>
</body>
</html>
