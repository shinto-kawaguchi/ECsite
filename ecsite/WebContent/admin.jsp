<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css">
<meta http-equiv="Content-Script-Type" content="text/javascript">
<meta http-equiv="imagetoolbar" content="no">
<meta name="description" content="">
<meta name="keywords" content="">
<title>管理者画面</title>

<style type="text/css">
/*========TAG LAYOUT========*/
body{
	margin:0;
	padding:0;
	line-height:1.6;
	letter-spacing:1px;
	font-family:Verdana,Helvetica,sans-serif;
	font-size:12px;
	coler:#333;
	background:#fff;
}
table{
	text-align:center;
	margin:0 auto;
}
/*========ID LAYOUT========*/
#top{
	width:780px;
	margin:30px auto;
	border:1px solid #333;
}
#header{
	width:100%;
	height:80px;
	background-color:black;
}
#main{
	width:100%;
	height:500px;
	text-align:center;
}
#left{
	width:40%;
	margin:10% 5% 10% 0 ;
	display:inline-block;
	/*border-left:1px solid #333;
	border-right:1px solid #333;
	border-bottom:1px solid #333;*/
}
#right{
	width:40%;
	margin:10% 0 10% 5% ;
	display:inline-block;
	/*border-left:1px solid #333;
	border-right:1px solid #333;
	border-bottom:1px solid #333;*/
}
#footer{
	width:100%;
	height:80px;
	background-color:black;
	clear:both;
}
</style>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>Admin</p>
		</div>
		<div>
			<div id="left">
				<p>商品</p>
				<div>
					<s:form action="ItemCreateAction">
						<s:submit value="新規登録"/>
					</s:form>
					<s:form action="ItemListAction">
						<s:submit value="一覧"/>
					</s:form>
				</div>
			</div>
			<div id="right">
				<p>ユーザー</p>
				<div>
					<s:form action="UserCreateAction">
						<s:submit value="新規登録"/>
					</s:form>
					<s:form action="UserListAction">
						<s:submit value="一覧"/>
					</s:form>
				</div>
			</div>
		</div>
		<div>
			<p>Homeへ戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>