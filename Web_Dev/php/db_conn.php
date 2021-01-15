<?php
    $servername = "localhost";
    $username = "php_website";
    $password = "php";
    $conn = null;

    try {
        $conn = new PDO("mysql:host=$servername;dbname=hr", $username, $password);
        $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
        // echo "Connection successfully<br>";
    } catch (PDOException $e) {
        echo "Connection failed: " . $e->getMessage();
    }
?>