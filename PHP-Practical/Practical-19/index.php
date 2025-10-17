<!-- 19. Working with Sessions (Set, Get, Destroy) -->
 
<?php
session_start();
if(!isset($_SESSION['visits'])) $_SESSION['visits']=0;
$_SESSION['visits']++;
echo "Session ID: ".session_id()."<br>";
echo "Visits this session: ".$_SESSION['visits']."<br>";
// To destroy:
session_destroy();
