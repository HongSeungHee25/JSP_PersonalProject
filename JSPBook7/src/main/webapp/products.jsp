<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "dto.Product" %>
<jsp:useBean id="productDAO" class="dao.ProductRepository" scope="session"/>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="./resources/css/bootstrap.min.css"/>
<title>도서 목록</title>

</head>
<body>
	<jsp:include page="menu.jsp"/>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">도서 목록</h1>
		</div>
	</div>
	<%
		ArrayList<Product> listOfBooks = productDAO.getAllProducts();
	%>
	<div class="container">
		<div class="row" align="center">
			<%
				for (int i=0; i < listOfBooks.size(); i++){
					Product book = listOfBooks.get(i);
			%>
			<div class="col-md-4">
				<h3><%=book.getBookName() %></h3>
				<p><%=book.getDescription() %></p>
				<p><%=book.getUnitPrice() %>원</p>
			</div>
			<%
				}
		
			%>
		</div>
		<jsp:include page="footer.jsp"></jsp:include>
		
	</div>
</body>
</html>
