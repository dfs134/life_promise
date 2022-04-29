window.onload = function(){
    // Initialize Swiper
    var swiper = new Swiper('.swiper-container', {
        spaceBetween: 10,
        slidesPerView :3,
        loop :true,
        autoplay: {
            delay: 1500
        },
        pagination: {
            el: '.swiper-pagination',
            clickable: true,
        },
    });
    
    
    
    $(document).ready(function(){
    
        $(window).resize(function(){
        $(window).scroll(function(){
            var scroll = $(this).scrollTop();
            if($(window).width() > 1250){
                if(scroll > 1500){
                    $(".det02").addClass("det02Active");
                    $(".mrg").addClass("pix");
                }else{
                    $(".det02").removeClass("det02Active");
                    $(".mrg").removeClass("pix");
                }
            }
        });
    }).resize();
    
    })
    
    
    var mnav = document.querySelector('.fixnav');
    var clk = document.querySelector('.fixbtn');
    var clkview = document.querySelector('.det02');
    var mrg = document.querySelector('.mrg');
    var windowWidth01 = window.matchMedia("screen and (max-width: 1250px)");
    var windowWidth02 = window.matchMedia("screen and (min-width: 1251px)");
    
        // .fixbtn 클릭시 .det02 클래스에 det02Active2 클래스 추가 제거
        if (windowWidth01.matches) {       
            clk.addEventListener('click',function(){
                clkview.classList.toggle('det02Active2');
                mrg.classList.toggle('pix2');
            }) 
        }
        
        // 1250px 이상일 경우 fixnav 사이드바 하이드
        if(windowWidth02.matches){
            mnav.style.display = 'none';
        }
}

