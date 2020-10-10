<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
	<a href="uploadform">Upload Image</a>
	<form action="savefile" method="post" enctype="multipart/form-data">
		select File: <input type="file" name ="file"/>
		<input type="submit" value="Upload File"/>
	</form>
</body>
</html>
