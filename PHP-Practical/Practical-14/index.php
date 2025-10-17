<!-- 14. Array Pointer Functions (current, next, prev, end, reset) -->
 
<?php
$colors = ["red","green","blue"];
echo current($colors)."<br>"; 
next($colors);
echo current($colors)."<br>"; 
end($colors);
echo current($colors)."<br>"; 
reset($colors);
echo current($colors)."<br>"; 
