<?php
    $severname = "localhost";
    $username = "php_website";
    $password = "php";
    $conn = null;
    $result = null;

    $sql = "SELECT ID, name, email, message FROM messages";

    try {
        $conn = new PDO("mysql:host=$severname;dbname=website", $username, $password);
        $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
        $stmt = $conn->prepare($sql);
        $stmt->execute();
        $result = $stmt->setFetchMode(PDO::FETCH_ASSOC);
        $result = $stmt->fetchAll();
    } catch (PDOException $e) {
        echo $e->getMessage();
    }

    $table =    "<table>";
    $table.=        "<tr>";
    $table.=            "<th>ID</th>";
    $table.=            "<th>Name</th>";
    $table.=            "<th>E-Mail</th>";
    $table.=            "<th>Message</th>";
    $table.=        "</tr>";

    for($i = 0; $i < count($result); $i++){
        $table.= "<tr>";
        foreach($result[$i] as $key => $value){
            $table.= "<td>$value</td>";
        }
        $table.= "</tr>";
    }
    $table.= "</table>";
?>