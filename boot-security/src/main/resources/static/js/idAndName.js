function showIdAndNameSelect(id, modelName, producttypeid) {
	var data = getIdAndNameDict(modelName, producttypeid);
	var select = $("#" + id);
	select.empty();

	$.each(data, function(id, name) {
		select.append("<option value ='" + id + "'>" + name + "</option>");
	});

	return data;
}

function getIdAndNameDict(modelName, producttypeid) {

	var url = '/idAndName/'+modelName;
	if(producttypeid !== undefined) {
	    url = '/idAndName/'+modelName + '/' + producttypeid;
    }
		$.ajax({
			type : 'get',
			url : url,
			async : false,
			success : function(data) {
				v = {};
				$.each(data, function(i, d) {
					v[d.id] = d.name;
				});

				sessionStorage[modelName] = JSON.stringify(v);
			}
		});

	return JSON.parse(sessionStorage[modelName]);
}

