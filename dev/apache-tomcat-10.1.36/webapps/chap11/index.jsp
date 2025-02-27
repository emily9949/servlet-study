<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Filter</h1>
<h3>필터의 라이프 사이클</h3>

<ul>
    <li><a href="first/filter">Filter 사용하기 </a></li>
<%--    필터를 여러개 거치려면 서블릿도 다단계로 구성하는 게 좋다 --%>
</ul>

<%-- 구분선 --%>
<hr>
<form action="member/regist" method="post">
<%--    label{아이디: } --%>
    <label>아이디: </label>
    <input type="text" name="userId">
    <br>
<%--    (label+input[name=password]+br)*2--%>
    <label>비밀번호: </label>
    <input type="text" name="password">
    <br>
    <label>이름: </label>
    <input type="text" name="name">
    <br>
<%--    button 태그는 아무것도 안적으면 submit 타입이 된다 --%>
    <button type="submit">가입하기</button>
</form>

</body>
</html>