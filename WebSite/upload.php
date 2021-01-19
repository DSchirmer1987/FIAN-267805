<?php
    $target_dir = __DIR__."/uploads/";
    if(!is_dir($target_dir)){
        mkdir($target_dir);
    }
    $target_file = $target_dir . basename($_FILES['fileToUpload']['name']);
    $uploadOk = 1;
    $filetype = strtolower(pathinfo($target_file, PATHINFO_EXTENSION));

    // echo "<pre>";
    // var_dump($_FILES);
    // echo "</pre>";

    // move_uploaded_file($_FILES['fileToUpload']['tmp_name'], $target_file);

    // echo $filetype;
    if(move_uploaded_file($_FILES['fileToUpload']['tmp_name'], $target_file)){
        echo "Upload erfolgreich. Sie werden zur Hauptseite weitergeleitet.";
    } else {
        echo "Upload nicht erfolgreich. Sie werden zur Hauptseite weitergeleitet.";
    }

    sleep(5);
    header('location: index.php');
?>