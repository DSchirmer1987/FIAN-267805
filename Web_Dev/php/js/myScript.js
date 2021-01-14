document.addEventListener("DOMContentLoaded", function(e){
    var row = document.getElementsByClassName("row");
    var listElemente = document.querySelectorAll("li");
    console.log(row);
    var i;
    // for(i = 0; i < listElemente.length; i++){
    //     console.log(listElemente[i].style.backgroundColor);
    //     listElemente[i].style.backgroundColor = "red";
    // }
    document.getElementById("myButton").addEventListener("click", function(){changeColor(document.getElementsByClassName("footer")[0],"red")});
    document.getElementById("home").addEventListener("click", loadDocument);

    console.log("Screen Width:" + screen.width);
    console.log("Screen Height:" + screen.height);
    console.log(window.location.href);
    console.log(window.location.hostname);
    console.log(window.location.pathname);

    console.log(document.cookie);

    var a = 2;
    console.log(a);
    a += 3; // a = a + 3
    a++; // a = a + 1
    console.log(a);
});

function changeColor(element, color){
    if(window.confirm("Wirklich die Farbe wechseln?")){
        element.style.backgroundColor = color;
        document.cookie ="username=; expires=Tue 12 Jan 2021 00:00:00 UTC;";
    }
}

function loadDocument(){
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function(){
        if (this.readyState == 4 && this.status == 200){
            var i;
            var xmlDoc = this.responseXML;
            var table = "<tr><th>Artist</th><th>Title</th><th>Country</th><th>Company</th><th>Price</th><th>Year</th></tr>";
            var x = xmlDoc.getElementsByTagName("CD");
            for(i=0;i < x.length; i++){
                table = table + "<tr><td>" +
                x[i].getElementsByTagName("ARTIST")[0].childNodes[0].nodeValue + "</td><td>" +
                x[i].getElementsByTagName("TITLE")[0].childNodes[0].nodeValue + "</td><td>" +
                x[i].getElementsByTagName("COUNTRY")[0].childNodes[0].nodeValue + "</td><td>" +
                x[i].getElementsByTagName("COMPANY")[0].childNodes[0].nodeValue + "</td><td>" +
                x[i].getElementsByTagName("PRICE")[0].childNodes[0].nodeValue + "</td><td>" +
                x[i].getElementsByTagName("YEAR")[0].childNodes[0].nodeValue + "</td>" +
                "</tr>";
            }
            document.getElementById("cd_table").innerHTML = table;
        }
    };
    xhttp.open("GET", "cd_catalog.xml", true);
    xhttp.send();
}