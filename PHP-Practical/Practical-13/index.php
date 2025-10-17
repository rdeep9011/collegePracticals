<!-- 13. Array Modification and Sorting -->
 
<?php
$a = [3,1,4];
array_push($a, 2);  
$last = array_pop($a);
unset($a[0]); 
$a = array_values($a);
sort($a); 
print_r($a);
