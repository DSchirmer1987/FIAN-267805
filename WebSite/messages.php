<?php
    include "getMessages.php";
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <?php include "includes/head.php" ?>
    <title>Nachrichten</title>
</head>
<body>
    <div class="header">
        <h1>Nachrichten</h1>
    </div>
    <div class="row">
        <?php include "includes/nav.php";?>
        <div class="col-6">
            <?=$table?>
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