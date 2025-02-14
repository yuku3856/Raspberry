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
	var inputLanguage =　$('input[name=language]:checked').map(function(){
		return $(this).val();
	}).get();
	const inputEmploymentType = $('[name=employmentType] option:selected').val();
	fd.append('age', inputAge);
	fd.append('sex', inputSex);
	fd.append('language', inputLanguage);
	fd.append('employmentType', inputEmploymentType);
	
	fetch('http://localhost:8080/accountlist/search', {
		method: 'POST',
		body: fd,
	})
	    .then(response => response.json())
	    .then(data => console.log(data));
}