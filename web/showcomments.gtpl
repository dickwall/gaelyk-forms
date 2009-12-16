<% include '/WEB-INF/includes/header.gtpl' %>

<h1>Comments</h1>

<table>
<tr>
	<th>Name</th>
	<th>Email</th>
	<th>Web Site</th>
	<th>Comments</th>
  </tr>

<%
  def commentsList = request.getAttribute("commentsList")

  commentsList.each { comment ->
    %>
    <tr>
      <td>${comment.name} </td>
      <td>${comment.email}</td>
      <td>${comment.website}</td>
      <td>${comment.comments}</td>
    </tr>
    <%
  }
  %>
 </table>
<% include '/WEB-INF/includes/footer.gtpl' %>
