$(function(){
    // Dasselbe wie:
    // document.getElementById('impressum').addEventListener("click", function(){window.location.assign('impressum.php')});
    $('#impressum').click(function(){
        $(location).attr('href', 'impressum.php');
    });
    $('#contact').click(function(){
        $(location).attr('href', 'contact.php');
    });
    $('#home').click(function(){
        $(location).attr('href', '/');
    })

    $('form').submit(function(event){
        var formData = {
            'name' : $('input[name=name]').val(),
            'email' : $('input[name=email]').val(),
            'website' : $('input[name=website]').val(),
            'message' : $('textarea[name=message]').val()
        };

        $.ajax({
            type : 'POST',
            url : 'sendformular.php',
            data : formData,
            dataType : 'json',
            encode : true
        }).done(function(data){
            console.log(data);

            if(!data.success){
                if(data.errors.name){
                    $('#name_group').append("<div class='error-block'>" + data.errors.name + "</div>");
                    $('#name').addClass('has-error');    
                }
                if(data.errors.email){
                    $('#email_group').append("<div class='error-block'>" + data.errors.email + "</div>");
                    $('#email').addClass('has-error');    
                }
                if(data.errors.message){
                    $('#message_group').append("<div class='error-block'>" + data.errors.message + "</div>");
                    $('#message').addClass('has-error');    
                }
            } else {
                $('form').html("<div class='success-block'><h3>" + data.message + "</h3></div>");
            }
        });
        
        event.preventDefault();
    });
});