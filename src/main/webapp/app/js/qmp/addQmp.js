$(function(){
	
	$('#addQmp').click(function() {
		$.ajax({
			type : "POST",
			dataType : "Qmp",
			async : false,
			url : "rest/qmp/insert",
			data : $('#insertForm').serialize(),
		});
		
		var url = "rest/qmp/list";
		$.get(url, function(data) {
			$('#main-content').html(data);
		});
	});
	
	$('#listQmp_1').click(function(e) {
		e.preventDefault();
		var url = this.href;
		$.get(url, function(data) {
			$('#main-content').html(data);
		});
	});
	
	$('#addQmp_x').unbind("click").bind("click",function(){
		$.ajax({
			type : "POST",
			//dataType : "Qmp",
			async : true,
			url : "rest/qmp/insert",
			data : $('#insertForm').serialize(),
			success : function() {
				var url = "rest/qmp/list";
				$.get(url, function(data) {
					$('#listAll').html(data);
				});
			}
		});
	});
});
