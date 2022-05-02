<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Todo's for ${name}</title>
</head>
<body>
    <h1>Your Todos</h1>
    <table>
        <caption>Your todos: </caption>
        <thead>
            <tr>
                <th>Description</th>
                <th>Date</th>
                <th>Is it Done?</th>
            </tr>
        </thead>
        <tbody>
            JSTL For Loop
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <th>${todo.desc}</th>
                    <th>${todo.targetDate}</th>
                    <th>${todo.done}</th>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <br/>
    <a href="/add-todo">Add a Todo</a>
</body>
</html>