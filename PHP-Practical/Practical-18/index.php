<!-- 18. Working with Cookies (Set, Read, Delete) -->
 
<?php
if (!isset($_COOKIE['username'])) {
    setcookie("username", "Depinder", time() + 3600, "/");
    echo "Cookie set! Refresh the page to read it.";
} else {
    echo "Cookie username: " . $_COOKIE['username'];
}
?>
