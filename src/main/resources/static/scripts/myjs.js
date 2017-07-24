$(document).ready(function(){
	

  $("#mybutton").click(function(){
	 var val= $("#search").val();
	 $.ajax({
		 url:"api",
	 	 data: {
	 		 data:val
	 	 },
	 	success:
	 		function(result){
	 		var temp = result-273;
	 		//alert(result -273);
	 		$("#show").html("The Current Temp at " + val.toUpperCase() +"is " + temp.toFixed(2) + "deg Celcius");
	 	}
	 });
	  
  });
  
    
});