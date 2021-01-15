$(function(){
    $('#database').click(function(){
        $(location).attr('href', 'phpajax.php');
    });

    $('#home').click(function(){
        $('#main').html("");
    });

    $('#mitarbeiter').click(function(){
       $('#main').html(
            "<h1>Mitarbeiterinfo</h1>" +
            "<select name=\"id\" id=\"id\" onchange=\"showMitarbeiter(this.value)\">" +
            "    <option value=''>Bitte wählen</option>" +
            "</select>"+
            "<hr>"+
            "<div id='info'><strong>Mitarbeiter Infos werden hier erscheinen</strong></div>"
       );
       writeMitarbeiterMain();
    });

    $('#jobs').click(function(){
        $('#main').html(
            "<h1>Job Info</h1>" +
            "<select name=\"id\" id=\"id\" onchange=\"showJob(this.value)\">" +
            "    <option value=''>Bitte wählen</option>" +
            "</select>"+
            "<hr>"+
            "<div id='info'><strong>Job Infos werden hier erscheinen</strong></div>"
        );
        writeJobsMain();
    })
});

function showMitarbeiter(id){
    if(id == ""){
        $('#info').html("<strong>Mitarbeiter Infos werden hier erscheinen</strong>");
    } else {
        $.post("getmitarbeiter.php",
        {
            id: id
        },
        function(data, status){
            $('#info').html(data);
        });
    }
}

function showJob(id){
    if(id == ""){
        $('#info').html("<strong>Job Infos werden hier erscheinen</strong>");
    } else {
        $.post("getjobs.php",
        {
            id: id
        },
        function(data, status){
            $('#info').html(data);
        });
    }
}

function writeMitarbeiterMain(){
    $.get("getmitarbeiter.php", function(data, status){
        $('#id').append(data);
    });
}

function writeJobsMain(){
    $.get("getjobs.php", function(data, status){
        $('#id').append(data);
    });
}

