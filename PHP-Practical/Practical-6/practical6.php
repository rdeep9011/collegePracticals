<!-- 6. Loops: for, while, do-while -->

<?php

for ($i=1; $i<=5; $i++) echo "5 x $i = " . (5*$i) . "<br>";

$sum=0; $i=1;
while ($i<=5) { $sum += $i; $i++; }
echo "Sum 1..5 = $sum<br>";

$j=6;
do { echo "do-while ran once (j=$j)"; } while ($j<5);
