<?php
    session_start();
    $cookie_name = "User";
    $user_name = 'PHP';
    setcookie($cookie_name, $user_name, time() + (86400), "/" )
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <?php include "includes/head.php"?>
    <title>Document</title>
</head>
<body>
    <div class="header">
        <h1>Unsere Webseite</h1>
    </div>
    <div class="row">
        <?php include "includes/nav.php";?>
        <div class="col-6">
            <h2>Beispieltext</h2>
            <?php
                $_SESSION['user'] = 'PHP';
                $_SESSION['key'] = '123abc';
                $password = 'password';
                echo "Password = ". $password. "<br>";
                $password = password_hash($password, PASSWORD_BCRYPT, array("cost" => 12));
                echo "Password = ". $password;
            ?>
        </div>
        <div class="col-3">
            <div class="aside">
                <h3>Beispieltext</h3>
            </div>
        </div>
    </div>
    <div class="footer">
        <p>Erstellt mit CSS, PHP, HTML und JS/JQuery</p>
    </div>
</body>
</html>