<% include '/WEB-INF/includes/header.gtpl' %>

<form action="submitfeedback.groovlet" method="post"> 
<div id="title">Contact Us</div>
  <%
    def formElements = request.getAttribute("formElements")    
  %>
<div class="row"><label class="col1">Name:&nbsp;&nbsp;</label>
<span class="col2"><%= formElements.textField("name") %></span>
</div>
<div class="row"><label class="col1">e-mail:&nbsp;&nbsp;</label>
<span class="col2"><%= formElements.textField("email") %></span>
</div>
<div class="row"><label class="col1">Website:&nbsp;&nbsp;</label>
<span class="col2"><%= formElements.textField("website") %></span>
</div>
<div class="row"><label class="col1comment">Comment:&nbsp;&nbsp;</label>
<span class="col2comment"><%= formElements.textArea("comment", cols=40, rows=4) %></span>
</div>
<div align="center" class="submit"><input type="image" src="images/b_send.gif" alt="send" width="52" height="19" border="0" />
</div>
<%
def errorList = request.getAttribute("errorList")

if (errorList != null) {
  %>
  <h2>Please fix the following errors:</h2>
  <%
  errorList.each { error ->
    %>
    <p>* ${error}</p>
    <%
  }
}
%>
</form>

<% include '/WEB-INF/includes/footer.gtpl' %>
