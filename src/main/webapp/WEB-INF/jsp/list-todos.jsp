<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Todos for ${name }</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
</head>
<body>
<a href="/add-todos">Add</a>
<br>

<h1>Your todos</h1>
	<table>
		<caption>Your todos are</caption>
		<thead>
			<tr>
				<th>Description</th>
				<th>Target Date</th>
				<th>is done?</th>
			</tr>
		</thead>
			
		<tbody>
		<c:forEach items="${todos}" var="todo">
			<tr>
				<td>${todo.desc}</td>
				<td>${todo.targetDate}</td>
				<td>${todo.done}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>