<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Todo's for ${name}</title>
<link href="webjars/bootstrap/3.2.0/css/bootstrap.min.css"
    	    		rel="stylesheet">
</head>
<body>
<div class="container">
    <table class="table table-striped">
        <caption>Your todos: </caption>
        <thead>
            <tr>
                <th>Description</th>
                <th>Date</th>
                <th>Is it Done?</th>
                <th>Delete</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.desc}</td>
                    <td>${todo.targetDate}</td>
                    <td>${todo.done}</td>
                    <td><a type="button" class="btn btn-warning" href="/delete-todo?id=${todo.id}">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <br/>
    <div>
    <a class="button" href="/add-todo">Add a Todo</a>
    </div>
    <script src="webjars/jquery/2.1.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</div>
</body>
</html>