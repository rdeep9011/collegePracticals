<!-- 17. Using Superglobal Variables ($_GET, $_POST, $_SERVER) -->
 
<?php
echo "Request Method: " . $_SERVER['REQUEST_METHOD'] . "<br>";
echo "Your IP: " . $_SERVER['REMOTE_ADDR'] . "<br>";
echo "Query String: " . ($_SERVER['QUERY_STRING'] ?? '') . "<br>";
print_r($_GET);
print_r($_POST);