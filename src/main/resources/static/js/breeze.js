      // Jquery Start  //
      $(document).ready(function(){
        // Login Open Start  //
  		$("body").on("click",".login_buton",function(){
  		$(".wrappers").addClass("active");
  		$(".login_container").addClass("active");
  		});

    // Login Open Finish  //

    // Login Close Start  //

      $("body").on("click",".close_login ,.wrappers", function() {
    setTimeout(function(){
      $(".wrappers").removeClass("active");
      $(".login_container").removeClass("active");
      $("#login_form_container").removeClass("login_form_container_two").addClass("login_form_container");
    },700);
      $("#login_form_container").removeClass("login_form_container").addClass("login_form_container_two");
    
    });

      // Login Close Finish  //

      // Register Open Start  //

        $("body").on("click",".register_buton",function(){
        $(".wrapperr").addClass("active");
        $(".register_container").addClass("active");
      });

        // Register Open Finish  //

        // Register Close Start  //

      $("body").on("click",".close_register ,.wrapperr",function(){
        setTimeout(function(){
      $(".wrapperr").removeClass("active");
      $(".register_container").removeClass("active");
      $("#register_form_container").removeClass("register_form_container_two").addClass("register_form_container");
   },700);
      $("#register_form_container").removeClass("register_form_container").addClass("register_form_container_two");
  });

      // Register Close Finish  //

    // Forgot Password Start  //
     $("body").on("click",".forgot",function(){
      $(".login_forgot").addClass("active");
      $(".forgot_login,.forgot_exit").addClass("active");
      $(".login_input,.loginss_button").addClass("login_forgot");
      });
      
      $("body").on("click",".forgot_exit",function(){
      $(".login_forgot").removeClass("active");
      $(".forgot_login,.forgot_exit").removeClass("active");
      $(".login_input,.loginss_button").removeClass("login_forgot");
      });
      
      // Forgot Password Finish  //

      // Login Text Alert Start  //
 
      var formLogin = $('#loginform');
      var submit = $('#login_submit');
     
      var username = $('input[name="login_username"]');
      var password = $('input[name="login_password"]');
      var login_error = $('#error_notification');
      formLogin.on('submit', function(e) {
      e.preventDefault();
  
      username.attr( "style", "" );
      password.attr( "style", "" );
      

   
    
     });

  
       
      // Language Open Start  //

       $("body").on("click",".lang",function(){
        $(".wrapperl").addClass("active");
        $(".language_container").addClass("active");
        $(".language_form_area").addClass("active");
      });

       // Language Open Finish  //

       // Language Close Start  //

        $("body").on("click",".language_area_close ,.wrapperl",function(){
        $(".wrapperl").removeClass("active");
        $(".language_container").removeClass("active");
      });

        // Language Open Finish  //

       AOS.init();

       // Swiper Slider Start  //

	   var swiper = new Swiper('.swiper-container', {
		  effect: 'coverflow',
		  grabCursor: true,
		  centeredSlides: true,
		  slidesPerView: 'auto', 
		  initialSlide: 1,
		  loop: true,
		  autoplay: {
            delay: 2000,
          },
		  coverflowEffect: {
			rotate: 50,
			stretch: 5,
			depth: 100,
			modifier: 1,
			slideShadows : true, 
		  },
		  pagination: {
			el: '.swiper-pagination',
		  },
		});
  	});
	   
     // Swiper Slider Finish  //

     // Jquery Finish  //