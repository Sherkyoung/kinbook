 $(function(){
        var featuredSwiper = $('.featured').swiper({
        		slidesPerView:'auto',
        		centeredSlides: true,
        		initialSlide:7,
        		tdFlow: {
        			rotate : 30,
        			stretch :10,
        			depth: 150
        		}
        	})
		$(".signIn,.signUp").click(function(){
			$(".backdrop").css("display","block");
            $(".signInDiv").css("display","block");
		})
		$(".signIn,.in").click(function(){
            $(".formDivReg").css("display","inline-block");
            $(".formDivSignUp").css("display","none");
            $(".up").css({"border-bottom":"0px solid #e65e42","color":"#7b7a7b"});
            $(".in").css({"border-bottom":"1px solid #e65e42","color":"#e65e42"});
        })
		$(".signUp,.up").click(function(){
            $(".formDivReg").css("display","none");
            $(".formDivSignUp").css("display","inline-block");
            $(".in").css({"border-bottom":"0px solid #e65e42","color":"#7b7a7b"});
            $(".up").css({"border-bottom":"1px solid #e65e42","color":"#e65e42"});
        })
        $()
        $(".signClose").hover(function(){
        	$(".signClose img").attr("src","../img/closedivSel.png");
        },function(){
        	$(".signClose img").attr("src","../img/closediv.png");
        })
		$(".signClose").click(function(){
			$(".backdrop").css("display","none");
            $(".signInDiv").css("display","none");
		})
        //校验
        var canSubmit=1;//提交按钮控制
        $(".email").blur(function(){
       		 var mail = $(this).val();
                    if (mail != '') {//�ж�
                        var reg = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/;
                        if (!reg.test(mail)) {
							$(".errorPwd").css("display","block");
							canSubmit=0;
                         	return false;
                    	}else{
                    		$(".errorPwd").css("display","none");
                    		canSubmit=1;
                    	}
                	}
        })
        $("#pwdP").blur(function(){
			var pwd = $("#pwd").val();
			var pwdP = $("#pwdP").val();
			if(pwd!=pwdP&&pwd!=null){
				$(".pwdJ").css("display","block");
				canSubmit=0;
			}else{
				$(".pwdJ").css("display","none");
				canSubmit=1;
			}
        })

        //js实现记住密码功能
        //初始化页面时验证是否记住了密码
        $(document).ready(function() {
        if ($.cookie("rmbUser") == "true") {
        $("#rem").attr("checked", true);
        $("#loginEmail").val($.cookie("userName"));
        $("#loginPwd").val($.cookie("passWord"));
        }
        });
        //保存用户信息
        $(".signUpDiv").click(function(){
            saveUserInfo();
        })
        function saveUserInfo() {
        alert($("#rem").attr("checked"))
        if ($("#rem").attr("checked") == "checked") {
        var userName = $("#loginEmail").val();
        var passWord = $("#loginPwd").val();
        $.cookie("rmbUser", "true", { expires: 7 }); // 存储一个带7天期限的 cookie
        $.cookie("userName", userName, { expires: 7 }); // 存储一个带7天期限的 cookie
        $.cookie("passWord", passWord, { expires: 7 }); // 存储一个带7天期限的 cookie
        }
        else {
        $.cookie("rmbUser", "false", { expires: -1 });
        $.cookie("userName", '', { expires: -1 });
        $.cookie("passWord", '', { expires: -1 });
        }
        }
  })