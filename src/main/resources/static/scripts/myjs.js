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
	 		alert(result -273);
	 	}
	 });
	  
  });
  
    
});