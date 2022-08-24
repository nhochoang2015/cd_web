/**
 * 
 */




$(document).ready(function() {
	var input = $('#findlocation').val();
	$('#findlocation').on('input', function() {
		console.log('test')
		$.ajax({
			url: './searchLocation',
			data: {
				locationName: input
			},
			success: function(responseText) {
				if (responseText === null) {
					$('#valueLoction').val("Bạn chưa nhập dữ liệu");
				} else {
					$('#valueLoction').val(responseText);
				}

			}
		});
	});
});
$(document).ready(function() {
	var input = $('#username').val();
	if (input == '') {
		$('#checkUsserr').text('Chưa nhập tên đăng nhập');
	}
	$('#username').on('input', function() {
		console.log('DTO')
		$.ajax({
			type: 'GET',
			dataType: 'Text',
			url: './CheckUserName',
			data: {
				Username: input
			},
			success: function(responseText) {
				if (responseText == true) {
					$('#checkUsserr').text('Tên đăng nhập này đã có người sử dụng');
				} else {
					$('#checkUsserr').text('Tên tài khoản này chưa đăng ký bạn có thể sử dụng');


				}

			}
		});
	});
});





