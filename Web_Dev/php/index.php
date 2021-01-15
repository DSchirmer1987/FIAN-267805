<?php
    $ausgabe = "Hallo PHP-Welt";
?>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
        <meta name="viewport" content="width=device-width, intitial-scale=1.0">
        <link rel="stylesheet" href="css/responsive.css">
        <title>Responsive Website</title>
        <script src="js/myScript.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="js/myQuery.js"></script>
    </head>
    <body>
        <div class="header">
            <h1>Responsive Website</h1>
        </div>
        <div class="row">
            <div class="col-3 col-s-3 menu">
                <ul>
                    <li id='home'>Home</li>
                    <li id='php'>My PHP</li>
                    <li id="forms">Formular</li>
                    <li id="database">Datenbankabfrage mit AJAX</li>
                    <li><button type="button" id="myButton">Farbwechsel</button></li>
                </ul>
            </div>
            <div class="col-6 col-s-9">
                <h1>Text auf der Website</h1>
                <p id="text">
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. In sit amet consectetur mauris, 
                    ut interdum erat. Donec convallis ultrices gravida. Aenean cursus molestie vulputate. 
                    Suspendisse venenatis diam vel dui elementum, quis egestas tellus gravida. Nam et ante 
                    quis metus pellentesque tempor pulvinar et elit. Integer porta magna rhoncus tristique dapibus.
                </p>
                <table id="cd_table"></table>
            </div>
            <div class="col-3 col-s-12">
                <div class="aside">
                    <h3>Text</h3>
                    <p>Beispieltext mit Erklärung</p>
                    <h3>Text</h3>
                    <p>Beispieltext mit Erklärung</p>
                    <h3>Text</h3>
                    <p>Beispieltext mit Erklärung</p>
                </div>
            </div>
        </div>
        <div class="footer">
            <p>Diese Website wurde mit VS Code erstellt.</p>
        </div>
    </body>
</html>