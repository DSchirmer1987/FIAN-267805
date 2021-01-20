// Funktion die ausgeführt wird, sobald das Dokument (Die Website) fertig geladen wurde
$(function(){
    // Holen aller Elemente mit der Klasse "Accordion"
    var acc = document.getElementsByClassName("accordion");
    var i;

    for(i = 0; i < acc.length; i++){
        // Hinzufügen eines Click-Events auf die Elemente
        acc[i].addEventListener("click", function(){
            // Wechseln zwischen activ und nicht-activ
            this.classList.toggle("accordion-active");

            // Holen des nächsten Element-"Geschwister" = Das nächste Element, das kein Kind-Element ist.
            var panel = this.nextElementSibling;
            // Wechsel zwischen Anzeigen und Nicht-Anzeigen
            if(panel.style.display === "block"){
                panel.style.display = "none";
            } else {
                panel.style.display = "block";
            }
        });
    }

    // var footer = document.getElementsByClassName("footer");
    // var fWidth = footer[0].offsetWidth;
    // console.log(fWidth);
    // footer[0].style.width = fWidth - 8 + "px";
    // // footer[0].style.marginRight = "8px";
    // footer[0].style.marginLeft = "8px";
});

// Wechseln zwischen Entfernen und hinzufügen der 'responsive'-Klasse zu der navigationsleiste
function openNav(){
    // Javascript - Version
    // Speichern des Elements mit der ID "nav" in X
    var x = document.getElementById('nav');
    if(x.className === "topnav"){
        x.className += " responsive";
    } else {
        x.className = "topnav";
    }

    // JQuery - Version
}