<!-- 9. Recursion: Factorial of a Number -->
 
<?php
function fact($n){ return ($n<=1)?1:$n*fact($n-1); }
echo "5! = " . fact(5);
