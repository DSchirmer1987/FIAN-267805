<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        // PDO
        $servername = "localhost";
        $username = "php_website";
        $password = "php";
        $conn = null;
        $country = array("EN", "England", "1");

        try {
            $conn = new PDO("mysql:host=$servername;dbname=hr", $username, $password);
            $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
            echo "Connection successfully<br>";
        } catch (PDOException $e) {
            echo "Connection failed: " . $e->getMessage();
        }

        function getCountries($conn){
            $stmt = $conn->prepare("SELECT country_id, country_name, region_id FROM countries");
            $stmt->execute();
            $result = $stmt->setFetchmode(PDO::FETCH_ASSOC);
            $result = $stmt->fetchAll();
            return $result;
        }

        function insertCountry($conn, $country){
            $sql = "INSERT INTO countries VALUES('$country[0]', '$country[1]', '$country[2]')";
            $conn->query($sql);
        }

        // echo "<pre>";
        // print_r(getCountries($conn));
        // echo "</pre>";
        // insertCountry($conn, $country);
        // echo "<hr>";
        // echo "<pre>";
        // print_r(getCountries($conn));
        // echo "</pre>";
        $myFile = fopen("Countries.txt", "w");
        echo "<pre>";
        for($i = 0; $i < count(getCountries($conn)); $i++){
            print_r(getCountries($conn)[$i]);
            fwrite($myFile, implode(";", getCountries($conn)[$i])."\n");
        }
        fclose($myFile);
        echo "</pre>";
    ?>
</body>
</html>