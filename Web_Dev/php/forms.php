<!DOCTYPE html>
<?php
    $name = $email = $website = $comment = $country = $gender = "";
    $email_error = $website_error = $comment_error = $country_error = $gender_error = "";
    if($_SERVER['REQUEST_METHOD'] == "POST"){
        $name = text_input($_POST['name']);
        if(empty($_POST['email'])){
            $email_error = "E-Mail ist notwending";
        } else if (!filter_var($_POST['email'], FILTER_VALIDATE_EMAIL)){
            $email_error = "Invalid E-Mail Format";
        }else {
            $email = text_input($_POST['email']);
        }
        if(empty($_POST['website'])){
            $website_error = "Website ist notwending";
        } else {
            $website = $_POST['website'];
        }
        $comment = $_POST['comment'];
        $country = $_POST['country'];
        $gender = $_POST['gender'];
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
        Website: <input type="text" name="website" id="website"><span><?=$website_error?></span><br>
        Kommentar: <textarea name="comment" id="" cols="30" rows="10"></textarea><br>
        Land : <input type="text" name="country" id="country"><br>
        Gechlecht: <input type="radio" name="gender" id="gender" value="weiblich">Weiblich <input type="radio" name="gender" id="gender" value="männlich">Männlich <br>
        <input type="submit" value="Absenden">
    </form>
    <h3>Die Daten: </h3>
    Name: <?=$name?><br>
    E-Mail: <?=$email?> <br>
    Website: <?=$website?> <br>
    Kommentar: <?=$comment?> <br>
    Land: <?=$country?> <br>
    Geschlecht: <?=$gender?> <br>
</body>
</html>