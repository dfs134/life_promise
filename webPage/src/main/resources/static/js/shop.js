window.onload = function(){
    var hov01 = document.querySelectorAll("figcaption");
    var hov02 = document.querySelectorAll(".subTxt");
    var hovr01 = document.querySelectorAll("figcaption > p");
    var hovr03 = document.querySelectorAll("figcaption > h3");
    var hovr02 = document.querySelectorAll(".subTxt > p");

    var clickbtn = document.querySelectorAll(".snip1384");
    var clickimg = document.querySelectorAll(".snip1384 > img");
    var clse = document.getElementById("nav2");
    var movea = document.querySelectorAll(".snip1384 > a");

    var windowWidth01 = window.matchMedia("screen and (max-width: 1250px)");
    var windowWidth02 = window.matchMedia("screen and (min-width: 1251px)");

        // 화면 너비에 따라 이벤트 발생
        if (windowWidth01.matches) { 
            for(var i=0; i < hovr02.length; i++){
                hovr02[i].style.display = "none";
            }
        } else {  }

        if (windowWidth02.matches) { 
            for(var i=0; i < hovr01.length; i++){
                hovr01[i].style.display = "none"; 
            }
        } else {  }

        if (windowWidth02.matches) { 
            for(var i=0; i < hovr03.length; i++){
                hovr03[i].style.display = "none"; 
            }
        } else {  }
        
        // 이미지 클릭시 이미지 내 텍스트 보인 후
        // 외부요소 클식시 사라짐 및 fadein 택스트 클릭시 해당 링크 이동
        for(let i = 0; i < clickbtn.length; i++){
                clickbtn[i].addEventListener('click',function(){
                clickimg[i].style.opacity = '0.5';
                hov01[i].style.opacity = '1';
                movea[i].style.zIndex = '3';
                clse.style.display = 'block';      
            })   
        }
        for(let i = 0; i < clickbtn.length; i++){
            clse.addEventListener('click',function(){
            clickimg[i].style.opacity = '1';
            hov01[i].style.opacity = '0';
            clse.style.display = 'none';
            movea[i].style.zIndex = '0';
        })
    }
}