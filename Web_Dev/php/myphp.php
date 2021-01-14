<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My PHP Page</title>
</head>
<body>
    <?php
        include "classes/auto.php";

        $auto = new Auto("Meins", "Passat", 1987, "Rot");
        var_dump($auto);
        echo "<br>";
        print_r($auto);
        echo "<br>";
        function schreibeNachricht(){
            echo "Dies ist eine Nachricht<br>";
        }
        // Einzeiliger Kommentar
        # Einzeiliger Kommentar
        /* 
            Mehrzeiliger Kommentar 
        */
        define("MFG", "Mit freundlichen Grüßen");
        define("FARBEN", ["Rot", "Blau", "Grün"]);
        echo "Hallo Welt<br>";
        print "Hallo Welt<br>";
        $text = "Hallo Welt<br>";
        $x = 5;
        $y = 10.5;
        $wahr = TRUE;
        $wahr2 = true;
        echo $x + $y;
        echo "<br>";
        var_dump($wahr);
        echo "<br>";
        var_dump($y);
        echo "<br>";
        $autos = array("BMW", true, 10);
        //echo $autos;
        var_dump($autos);
        echo "<br>";
        print_r($autos);
        echo "<br>";
        echo "<br>";
        echo "<br>";
        echo "<br>";
        echo "<br>";
        // String_Methoden
        $string = "Dies ist ein String";
        echo str_word_count($string)."<br>";
        echo strrev($string)."<br>";
        echo strpos($string, "ein")."<br>";
        echo str_replace("String", "Satz", $string)."<br>";
        echo "<br>";
        echo "<br>";
        echo "<br>";
        // Number_Methoden
        $zahl = 567;
        $zahl2 = 1340.67;
        var_dump(is_int($zahl));
        var_dump(is_float($zahl2));
        var_dump(is_numeric($zahl));
        echo "<br>";
        echo "<br>";
        // Math Methoden
        echo pi()."<br>";
        echo rand()."<br>";
        echo rand(10, 100)."<br>";
        echo MFG."<br>";
        var_dump(FARBEN);
        echo "<br>";
        $result = $x == $y;
        var_dump($result)."<br>";
        var_dump($x != $y)."<br>";
        var_dump($x !== $y)."<br>";
        var_dump($x <> $y)."<br>";
        echo "<br>";
        if($x == 1){
            echo "Ist eins";
        } else if ($x == 2){
            echo "Ist zwei";
        } else {
            echo "Ist größer als zwei";
        }
        echo "<br>";
        switch ($x) {
            case 1:
                echo "Ist eins";
                break;
            
            default:
                echo "Ist nicht eins";
                break;
        }
        echo "<br>";
        // Schleifen
        for ($i=0; $i < 5; $i++) { 
            echo $i;
        }
        echo "<br>";
        foreach ($autos as $value) {
            echo $value;
        }
        echo "<br>";
        schreibeNachricht();
        //Arrays
        $tiere = array("Kuh", "Schwein", "Schaf");
        $alter = array("Peter" => "15", "Ben" => "68", "Berta"=> "22");
        foreach($alter as $key => $value){
            echo "Key= ".$key." value=".$value."<br>";
        }
        $mitarbeiter = array(array("Peter","Administration","1985"),
                             array("Ben","Einkauf", "1963"));
        echo $mitarbeiter[0][0] . " - ". $mitarbeiter[0][1]." - ".$mitarbeiter[0][2]."<br>";
    ?>
</body>
</html>