<% include '/WEB-INF/includes/header.gtpl' %>

<form action="submitfeedback.groovlet" method="post"> 
<div id="title">Contact Us</div>
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
<div class="row"><label class="col1">Name:&nbsp;&nbsp;</label>
<span class="col2"><input name="name" class="input" type="text" id="name" size="40" tabindex="1"  /></span>
</div>
<div class="row"><label class="col1">e-mail:&nbsp;&nbsp;</label>
<span class="col2"><input name="email" class="input" type="text" id="email" size="40" tabindex="2" /></span>
</div>
<div class="row"><label class="col1">Website:&nbsp;&nbsp;</label>
<span class="col2"><input name="website" class="input" type="text" id="website" value="http://" size="40" tabindex="3" /></span>
</div>
<div class="row"><label class="col1comment">Comment:&nbsp;&nbsp;</label>
<span class="col2comment"><textarea cols="40" class="textarea" rows="4" name="comment" id="comment" tabindex="4" ></textarea></span>
</div>
<div align="center" class="submit"><input type="image" src="images/b_send.gif" alt="send" width="52" height="19" border="0" />
</div>
</form>

<% include '/WEB-INF/includes/footer.gtpl' %>
