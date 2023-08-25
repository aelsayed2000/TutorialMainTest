<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <title>Hello World Example</title>
</head>
<body>
    <h1>Hello World Example</h1>
    
    <s:form action="updateSports">
        <s:textfield name="newSport" label="New Sport" value="%{newSport}" />
        <s:submit value="Add Sport" />
    </s:form>

    <!-- Display validation errors -->
    <s:fielderror fieldName="newSport" />

    <s:if test="sports.isEmpty()">
        <div class="empty-message">No sports added yet.</div>
    </s:if>
    <s:else>
        <!-- Display sports list -->
        <h2>Sports List:</h2>
        <s:iterator value="sports">
            <s:property />
            <br />
        </s:iterator>
    </s:else>
</body>
</html>
