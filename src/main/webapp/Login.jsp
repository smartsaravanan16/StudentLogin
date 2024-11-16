<!DOCTYPE html>
<html>
<head>
    <title>Student Login Form</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <script type="text/javascript">
        function checkEmptyValues() {
            if (document.getElementById('userName').value.trim() === "") {
                alert("Please enter your UserName");
                return false;
            }
            if (document.getElementById('password').value.trim() === "") {
                alert("Please enter your Password");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
    <div class="container">
        <h1>Student Login</h1>
        <form action="Login" method="post" onsubmit="return checkEmptyValues()">
            <div class="form-group">
                <label for="userName">UserName:</label>
                <input type="text" id="userName" name="userName">
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password">
            </div>
            <div class="form-actions">
                <button type="submit">Login</button>
            </div>
        </form>
    </div>
</body>
</html>
