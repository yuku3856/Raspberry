/**
 * 
 */
$(function () {
	$('#registerAccount').on('click', registerAccount);
})

function registerAccount () {
	const fd = new FormData();
	const inputAge = $('input[name=age]').val();
	const inputSex = $('input[name=sex]').val();
	var inputLanguage = $('input[name=language]').val();
	const inputEmploymentType = $('input[name=employmentType]').val();
	fd.append('age', inputAge);
	fd.append('sex', inputSex);
	fd.append('language', inputLanguage);
	fd.append('employmentType', inputEmploymentType);
	
	let param = {};
	param['age'] = inputAge;
	param['sex'] = inputSex;
	param['language'] = inputLanguage;
	param['employmentType'] = inputEmploymentType;
	$.ajax({
		url: 'http://localhost:8080/accountRegister/register',
	    type: 'POST',
	    dataType: 'json',
	    data: param,
	    timeout: 5000,
	})
	.done(function(data) {
	      // 通信成功時の処理を記述
		console.log("おめ");
	})
	.fail(function() {
		  // 通信失敗時の処理を記述
	});
}

