$(function(){
    function timedCount(count){
        setTimeout(function(){
            count--;
            if(count>=0){
                  $("#daoJi").text(count)
                  timedCount(count);
            }else{
               $(".smallSpan>span").text("做人别太死心眼，再发一封，还是直接去看书？");
            }
        },1000)

    };
    timedCount(90);
})
