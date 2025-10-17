<!-- 15. HTML Form Handling using GET Method -->
 
<?php
$name = htmlspecialchars($_GET['name'] ?? '');
echo "Hello, $name";
