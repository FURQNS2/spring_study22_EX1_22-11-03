<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유게시판 글쓰기</title>
</head>
<body>
	<h2>자유게시판 글쓰기</h2>
	<hr>
	
	<table border="1" cellpadding="0" cellspacing="0">
		<form action="write">
			<tr>
				<td bgcolor="#bbbbbb">이 름</td>
				<td><input type="text" name="bname" size="60"></td>
			</tr>
			<tr bgcolor="#bbbbbb">
				<td>제 목</td>
				<td><input type="text" name="btitle" size="60"></td>
			</tr>
			<tr bgcolor="#bbbbbb">
				<td>내 용</td>
				<td><textarea name="bcontent" rows="10" cols="45"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="submit" value="글입력">&nbsp;&nbsp;
					<input type="reset" value="취소" onclick="javascript:window.location='list'">&nbsp;&nbsp;
					<input type="button" value="글목록" onclick="javascript:window.location='list'">&nbsp;&nbsp;
				</td>
			</tr>			
		</form>
	</table>

</body>
</html>