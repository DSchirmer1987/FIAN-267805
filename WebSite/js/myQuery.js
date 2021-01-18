$(function(){
    // Dasselbe wie:
    // document.getElementById('impressum').addEventListener("click", function(){window.location.assign('impressum.php')});
    $('#impressum').click(function(){
        $(location).attr('href', 'impressum.php');
    });
});