/**
 * 
 */
$(function () {
	$('#searchAccount').on('click', searchAccount);
})

function searchAccount () {
	const fd = new FormData();
	const inputAge = $('input[name=age]').val();
	const inputSex = $('input[name=sex]:checked').val();
	var inputLanguage = $('input[name=language]:checked').map(function(){
		return $(this).val();
	}).get();
	const inputEmploymentType = $('[name=employmentType] option:selected').val();
	fd.append('age', inputAge);
	fd.append('sex', inputSex);
	fd.append('language', inputLanguage);
	fd.append('employmentType', inputEmploymentType);
	
	let param = {};
	param['age'] = inputAge;
	//param['sex'] = inputSex;
	//param['language'] = inputLanguage;
	//param['employmentType'] = inputEmploymentType;
	$.ajax({
		url: 'http://localhost:8080/accountList/search',
	    type: 'POST',
	    dataType: 'json',
	    data: param,
	    timeout: 5000,
	})
	.done(function(data) {
	      // 通信成功時の処理を記述
		let tbody = $('#dataTable');
		  	
		data.forEach(function(item) {
		  	let row = '<tr>' +
		  	'<td>' + item.id + '</td>' +
			'<td>' + item.accountName + '</td>' +
	  		'<td>' + item.company + '</td>' +
			'</tr>';
	  		tbody.append(row);
	  	});
	})
	.fail(function() {
		  // 通信失敗時の処理を記述
	});
}

