<!-- 
    Kontaktformular

    Name - Notwendig
    E-Mail - Notwendig
    Website - Optional
    Nachricht - Notwending


    <form action='sendformular.php'>
        inputs
        <input type submit>
    </form>
 -->
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
            <h2>Kontaktformular</h2>
            <form action="sendformular.php" method="post">
                <div id="name_group">
                    <label for="name">Name:</label><br>
                    <input type="text" name="name" id="name"><br>
                </div>
                <div id="email_group">
                    <label for="email">E-Mail:</label><br>
                    <input type="email" name="email" id="email"><br>
                </div>
                <div>
                    <label for="website">Website:</label><br>
                    <input type="text" name="website" id="website"><br>
                </div>
                <div id="message_group">
                    <label for="message">Nachricht:</label><br>
                    <textarea name="message" id="message" cols="30" rows="10"></textarea>
                </div>
                <br>
                <hr>
                <button type="submit" id="form_send">Absenden</button>
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