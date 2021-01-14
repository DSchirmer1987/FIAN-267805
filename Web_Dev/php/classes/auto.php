<?php
class Auto {
    private $name;
    private $modell;
    private $baujahr;
    private $farbe;

    function __construct($name, $modell, $baujahr, $farbe){
        $this->name = $name;
        $this->modell = $modell;
        $this->baujahr = $baujahr;
        $this->farbe = $farbe;
    }

    function get_name(){
        return $this->name;
    }
    function get_modell(){
        return $this->modell;
    }
    function get_baujahr(){
        return $this->baujahr;
    }
    function get_farbe(){
        return $this->farbe;
    }
}