<!-- 10. String Handling and HEREDOC Example -->

<?php
$s = "Hello PHP";
echo "$s<br>";
echo "Length: " . strlen($s) . "<br>";
echo "Pos of 'PHP': " . strpos($s, "PHP") . "<br>";
echo "Replace: " . str_replace("PHP","World",$s) . "<br>";
echo "Substr(6,3): " . substr($s,6,3) . "<br>";

$first = $s[0];    
echo "First char: $first<br>";

$block = <<<TXT
This is a HEREDOC block.
Variables work here: $s
TXT;
echo nl2br($block);
