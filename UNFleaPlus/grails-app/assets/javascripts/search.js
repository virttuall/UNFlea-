$(document).ready(function() {
	
	var text = $('#search').text();
	var products = text.substring(1, text.length-1).split(",");
	$('.typeahead').typeahead({
        name: 'products',
        source: products,
        limit: 10
    });
	
})(jQuery);