<?php
    if($_SERVER['REQUEST_MODE'] == "POST"){
        function text_input($data){
            $data = trim($data);
            $data = stripslashes($data);
            $data = htmlspecialchars($data);
            return $data;
        }
        $name = text_input($_POST['name']);
    }

    
?>