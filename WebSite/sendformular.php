<?php
    if($_SERVER['REQUEST_METHOD'] == "POST"){
        $errors = array();
        $data = array();
        $name = $email = $website = $message = "";

        function text_input($data){
            $data = trim($data);
            $data = stripslashes($data);
            $data = htmlspecialchars($data);
            return $data;
        }

        if(empty($_POST['name'])){
            $errors['name'] = "Name wird benötigt";
        } else {
            $name = text_input($_POST['name']);
        }

        if(empty($_POST['email'])){
            $errors['email'] = "E-Mail wird benötigt";
        } else {
            $email = text_input($_POST['email']);
        }

        if(empty($_POST['website'])){
            $website = "";
        } else {
            $website = text_input($_POST['website']);
        }

        if(empty($_POST['message'])){
            $errors['message'] = "Nachricht wird benötigt";
        } else {
            $message = text_input($_POST['message']);
        }
        
        if(!empty($errors)){
            $data['success'] = false;
            $data['errors'] = $errors;
        } else {
            $data['success'] = true;
            $data['message'] = "Erfolgreich!";

            $severname = "localhost";
            $username = "php_website";
            $password = "php";
            $conn = null;

            function addMessage($conn){
                global $name, $message, $email;
                $sql = "INSERT INTO messages(Name, Message, EMail) VALUES('$name', '$message', '$email')";
                $conn->exec($sql);
                $data['Last_ID'] = $conn->lastInsertId();
            }

            try {
                $conn = new PDO("mysql:host=$severname;dbname=website", $username, $password);
                $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
                addMessage($conn);
            } catch (PDOException $e) {
                $data['error_message'] = $e->getMessage();
            }
        }

        // mail("", "Kontaktformular", $message, "From: ".$email);

        echo json_encode($data);
    }

    
?>