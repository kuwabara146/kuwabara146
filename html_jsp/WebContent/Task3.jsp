<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>
<%@page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<%! int count = 1; %>
<%!
    //日付取得のメソッド
    public String getDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = new Date();
        return sdf.format(date);
    }
%>
<meta charset="UTF-8">
<title>JSP KADAI</title>
</head>
<body>
    <h1>訪問回数: <%= count++ %></h1>
    <p>今日の日付: <%= getDate() %></p>
</body>
</html>