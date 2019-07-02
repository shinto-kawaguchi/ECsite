<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<title>ユーザー一覧</title>

<style type="text/css">
/*========TAG LAYOUT========*/
body{
	margin:0;
	padding:0;
	line-height:1.6;
	letter-spacing:1px;
	font-family:Verdana, Helvetica, sans-serif;
	font-size:12px;
	color:#333;
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
#footer{
	width:100%;
	height:80px;
	background-color:black;
	clear:both;
}
</style>
<script type="text/javascript">
	function submitAction(url){
		$('form').attr('action', url);
		$('form').submit();
	}
</script>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>UserList</p>
		</div>
		<div>
			<s:if test="userInfoList == null">
				<h3>ユーザーはいません。</h3>
			</s:if>
			<s:else>
				<h3>ユーザーは以下になります。</h3>
				<table border="1">
					<tr>
						<th>ユーザー名</th>
						<th>ログインID</th>
						<th>パスワード</th>
						<th>登録日時</th>
					</tr>
					<s:iterator value="userInfoList">
						<tr>
							<td><s:property value="userListUserName"/></td>
							<td><s:property value="userListLoginId"/></td>
							<td><s:property value="userListLoginPassword"/></td>
							<td><s:property value="userListInsert_date"/></td>
						</tr>
					</s:iterator>
				</table>
				<s:form>
					<tr>
						<td><input type="button" value="戻る" onclick="submitAction('AdminAction')"/></td>
						<td><input type="button" value="削除" onclick="submitAction('UserListDeleteConfirmAction')"/></td>
					</tr>
				</s:form>
			</s:else>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>