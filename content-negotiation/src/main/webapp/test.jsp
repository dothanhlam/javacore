<html>
<script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>

<body>
<h2>Hello World!</h2>
<ul id="items"></ul>
<script type="application/javascript">       
 (function($) {
     $.ajax({
         type: 'GET',
         url: 'http://localhost:8080/content-negotiation/employee/list.jsonp',
         async: false,
         jsonpCallback: 'getEmployeeListCallback',
         dataType: 'jsonp',
         success: function(data) {
        	 console.log(data)
        	      
         }
     });
})(jQuery);
</script>
</body>
</html>
