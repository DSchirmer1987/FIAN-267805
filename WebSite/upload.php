<?php
    // setzen des Zielordners
    $target_dir = __DIR__."/uploads/";
    // prüfen ob Ordner existiert
    if(!is_dir($target_dir)){
        // erstellen des Ordners
        mkdir($target_dir);
    }
    // Setzen der Zieldatei mit komplettem pfad
    $target_file = $target_dir . basename($_FILES['fileToUpload']['name']);
    $uploadOk = 1;
    $filetype = strtolower(pathinfo($target_file, PATHINFO_EXTENSION));

    // Prüfen ob der Kopiervorgang mit move_upload_files erfolgreich war.
    if(move_uploaded_file($_FILES['fileToUpload']['tmp_name'], $target_file)){
        echo "Upload erfolgreich. Sie werden zur Hauptseite weitergeleitet.";
    } else {
        echo "Upload nicht erfolgreich. Sie werden zur Hauptseite weitergeleitet.";
    }

    // 5 Sekunden warten
    sleep(5);
    // Weiterleiten auf eine URL
    header('location: index.php');
?>