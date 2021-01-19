<!DOCTYPE html>
<html lang="en">
<head>
    <?php include "includes/head.php" ?>
    <title>Impressum</title>
</head>
<body>
    <div class="header">
        <h1>Kontaktformular</h1>
    </div>
    <div class="row">
        <?php include "includes/nav.php";?>
        <div class="col-6">
            <h2>Datei hochladen</h2>
            <form action="upload.php" method="post" enctype="multipart/form-data">
                <div id="fileToUpload_group">
                    <label for="fileToUpload">Datei auswählen:</label><br>
                    <input type="file" name="fileToUpload" id="fileToUpload"><br>
                </div>
                <input type="submit" value="Absenden">
            </form>
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