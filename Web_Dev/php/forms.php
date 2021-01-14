<!DOCTYPE html>
<?php
    $name = $email = "";
    $email_error = "";
    if($_SERVER['REQUEST_METHOD'] == "POST"){
        $name = text_input($_POST['name']);
        if(empty($_POST['email'])){
            $email_error = "E-Mail is notwending";
        } else if (!filter_var($_POST['email'], FILTER_VALIDATE_EMAIL)){
            $email_error = "Invalid E-Mail Format";
        }else {
            $email = text_input($_POST['email']);
        }
    }

    function text_input($data){
        $data = trim($data);
        $data = stripslashes($data);
        $data = htmlspecialchars($data);
        return $data;
    }
?>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formular</title>
</head>
<body>
    <h1>Mein Formular mit PHP</h1>
    <form action="<?php echo htmlspecialchars($_SERVER['PHP_SELF']) ?>" method="post">
        Name: <input type="text" name="name" id="name" required><br>
        E-Mail: <input type="text" name="email" id="email"><span><?=$email_error?></span><br>
        <!-- Website Input -->
        <!-- Kommentar Textfeld <Textarea>-->
        <!-- Land Input -->
        <!-- Geschlecht Radio Buttons <input type="radio" value="">-->
        <input type="submit" value="Absenden">
    </form>
    <h3>Die Daten: </h3>
    Name: <?=$name?><br>
    E-Mail <?=$email?> <br>
</body>
</html>