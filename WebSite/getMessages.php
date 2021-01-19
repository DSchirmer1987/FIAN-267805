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
        //Preparieren des SQL-Strings, d.h. alles was nicht SQL is wird ignoriert/entfernt
        $stmt = $conn->prepare($sql);
        // Ausführen
        $stmt->execute();
        // Setzen des Modus für das holen von Daten auf assosiativ, d.h. es wird ein Assosiatives Array zurückgegeben.
        $result = $stmt->setFetchMode(PDO::FETCH_ASSOC);
        // Holen von allen Spalten, die mit dem SQL gefunden wurden.
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