	<!-- Footer -->
	<footer class="w3-center w3-light-grey w3-padding-48 w3-large">
	<p>
		Powered by <a href="http://www.w3schools.com/w3css/default.asp"
			title="W3.CSS" target="_blank" class="w3-hover-text-green">w3.css</a>
	</p>
	</footer>
	<script>
		//accordion
		function myFunction(id) {
			var x = document.getElementById(id);
			if (x.className.indexOf("w3-show") == -1) {
				x.className += " w3-show";
			} else {
				x.className = x.className.replace(" w3-show", "");
			}
		}
	</script>