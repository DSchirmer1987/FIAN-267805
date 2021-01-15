<?php
    // $servername = "localhost";
    // $username = "php_website";
    // $password = "php";
    // $conn = null;

    // try {
    //     $conn = new PDO("mysql:host=$servername;dbname=hr", $username, $password);
    //     $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    //     // echo "Connection successfully<br>";
    // } catch (PDOException $e) {
    //     echo "Connection failed: " . $e->getMessage();
    // }

    include "db_conn.php";

    if($_SERVER['REQUEST_METHOD'] == "POST"){
        $id = $_POST['id'];

        function getEmployees($conn, $id){
            $stmt = $conn->prepare("SELECT employee_id, first_name, last_name, email, phone_number, hire_date FROM employees WHERE employee_id = $id");
            $stmt->execute();
            $result = $stmt->setFetchmode(PDO::FETCH_ASSOC);
            $result = $stmt->fetchAll();
            return $result;
        }

        $table = "<table>".
                    "<tr>".
                        "<th>ID</th>".
                        "<th>Vorname</th>".
                        "<th>Nachname</th>".
                        "<th>E-Mail</th>".
                        "<th>Telefon</th>".
                        "<th>Einstelldatum</th>".
                    "</tr>";
        $mitarbeiter = getEmployees($conn, $id);
        for($i=0; $i < count($mitarbeiter); $i++){
            $table .= "<tr>";
            foreach($mitarbeiter[$i] as $key => $value){
                $table .= "<td>$value</td>";
            }
            $table .= "</tr>";
        }
        $table .= "</table>";
        echo $table;
    } 
    else if ($_SERVER['REQUEST_METHOD'] == "GET"){
        function getEmployees($conn){
            $stmt = $conn->prepare("SELECT employee_id, first_name, last_name FROM employees");
            $stmt->execute();
            $result = $stmt->setFetchmode(PDO::FETCH_ASSOC);
            $result = $stmt->fetchAll();
            return $result;
        }
        $mitarbeiter = getEmployees($conn);
        $options = "";
        for($i=0; $i < count($mitarbeiter); $i++){
            $options .= "<option value=".$mitarbeiter[$i]['employee_id'].">".$mitarbeiter[$i]['first_name']." ".$mitarbeiter[$i]['last_name']."</option>";
        }
        echo $options;
    }   
?>