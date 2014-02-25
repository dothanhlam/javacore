<html>
<head>
	
	<script type="text/javascript">
		var totalFiles = 1;
		function onFileSelected(fileIndex) {
			var lastFileIndex = fileIndex - 1;
			var uploadedFiles = document.getElementById("uploadedFiles");
			var newFileUploadDom = document.createElement("input");

			var lastFileUpload = document.getElementById("files["+lastFileIndex+"]");
			lastFileUpload.style.display="none";
			newFileUploadDom.setAttribute("id", "files[" +fileIndex+"]");
			newFileUploadDom.setAttribute("type", "file");
			newFileUploadDom.setAttribute("onchange", "onFileSelected(totalFiles++)");
			uploadedFiles.appendChild(newFileUploadDom);
			
			var list = document.getElementById('pendingFiles');
			var entry = document.createElement('li');
			entry.setAttribute("id",lastFileIndex);
			entry.addEventListener('click', function(e) {
			    console.log(e.target.id);
				var fileTobeRemoved = document.getElementById("files["+e.target.id+"]");
				fileTobeRemoved.parentNode.removeChild(fileTobeRemoved);
				e.target.parentNode.removeChild(e.target);
			});
			entry.appendChild(document.createTextNode(lastFileUpload.value.split('/').pop().split('\\').pop()));
			list.appendChild(entry);
		}
		
		
	</script>
</head>
<body>	
	<h2>File Upload</h2>
	
	<div id="uploadedFiles" >	
		<input id="files[0]" type="file" onchange="onFileSelected(totalFiles++)" />
	</div>
	<div>
		<span>Pending files</span>
		<ol id="pendingFiles"></ol>
	</div>
</body>
</html>
