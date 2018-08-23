<!DOCTYPE html>
<html lang="en">
<head>
    <title>|Login|</title>
</head>

<body>
    <div>
      <form action="LoginController" method="post">        
        <div>
            <p><a href="login.jsp"></a></p>
            <div>
              <input type="text" name="email" placeholder="User Email" autofocus>
            </div>
            <div>
                <input type="password" name="pass" placeholder="Password">
            </div>
            <label>
                <span> <a href="#"> Forgot Password?</a></span>
            </label>
            <button type="submit">Login</button>
            <a href="register.jsp"><button type="submit">Signup</button></a>
        </div>
      </form>
    </div>
  </body>
</html>
