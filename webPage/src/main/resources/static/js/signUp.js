function joinform_check(){
		
		var username = document.getElementById("username");
		var password = document.getElementById("password");
		var repassword = document.getElementById("repassword");
		var name = document.getElementById("name");
		var men = document.getElementById("men");
		var women = document.getElementById("women");
		var tel1 = document.getElementById("tel1");
		var tel2 = document.getElementById("tel2");
		var tel3 = document.getElementById("tel3");
		var email = document.getElementById("email");
		/*var email2 = document.getElementById("email2");*/
		var email3 = document.getElementById("email3");
		var agreeY = document.getElementById("agreeY");
		var agreeN = document.getElementById("agreeN");
		var agree2Y = document.getElementById("agree2Y");
		var agree2N = document.getElementById("agree2N");
		var agree3Y = document.getElementById("agree3Y");
		var agree3N = document.getElementById("agree3N");
		
		if(username.value == ""){
			alert("아이디를 입력하세요");
			username.focus();
			return false;
		}
		
		if(password.value == ""){
			alert("비밀번호를 입력하세요");
			password.focus();
			return false;
		}
		
		var pwdCheck = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,25}$/;
		if (!pwdCheck.test(password.value)) {
    		alert("비밀번호는 영문자+숫자+특수문자 조합으로 8~25자리 사용해야 합니다.");
		    password.focus();
		    return false;
		};
		
		if(password.value !== repassword.value){
			alert("비밀번호가 일치하지 않습니다");
			repassword.focus();
			return false;
		}
		
		if(name.value == ""){
			alert("이름을 입력하세요");
			name.focus();
			return false;
		}
		
		if(!men.checked && !women.checked){
			alert("성별을 선택하세요");
			men.focus();
			return false;
		}
		

		var reg1 = /^01([0|1|6|7|8|9])$/
		var reg2 = /^[0-9]{3,4}$/
		var reg3 = /^[0-9]{4}$/
		
		if(!reg2.test(tel2.value)){
			alert("전화번호를 숫자만 입력이 되어야 합니다");
			tel2.focus();
			return false;
		}
		if(!reg3.test(tel3.value)){
			alert("전화번호를 숫자만 입력이 되어야 합니다");
			tel3.focus();
			return false;
		}

		
		if(email.value === ""){
			alert("이메일을 정확히 입력하세요");
			email.focus();
			return false;
		}
		
		if(email3.value === ""){
			alert("이메일을 정확히 입력하세요");
			email3.focus();
			return false;
		}
		
		/*if(!agreeY.checked && !agreeN.checked){
			alert("이용약관 동의에 체크해주세요");
			agreeY.focus();
			return false;
		}*/
		if(!agreeY.checked){
			alert("이용약관 동의는 필수입니다");
			agreeY.focus();
			return false;
		}
		
		if(!agree2Y.checked){
			alert("개인정보 수집 및 이용 동의는 필수입니다");
			agree2Y.focus();
			return false;
		}
		
		if(!agree3Y.checked && !agree3N.checked){
			alert("쇼핑정보 수신 동의 여부를 체크해 주세요");
			agree3Y.focus();
			return false;
		}
	
		document.join_form.submit();
		
		
	}
	
		function id_check(){
		window.open("", "", "width=600, height=300, left=200, top=100");
		
		
	}
		
		function change_email() {	
		  //지금 골라진 옵션의 순서와 값 구하기
		  var idx = email2.options.selectedIndex;
		  var val = email2.options[idx].value;
		
		  email3.value = val;
	}
	
	