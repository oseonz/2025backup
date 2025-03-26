<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	@qepuestMapping("/test2")
	public string test2(Member member, Model model) {
		return "test2";
	}
</body>
</html>