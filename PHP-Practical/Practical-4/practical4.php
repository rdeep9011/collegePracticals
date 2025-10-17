<!-- 4. If-Else and Ternary Operator -->

<?php
$marks = 72;
if ($marks >= 80)      $grade = "A";
elseif ($marks >= 60)  $grade = "B";
elseif ($marks >= 50)  $grade = "C";
else                   $grade = "D";

echo "Marks: $marks, Grade: $grade<br>";
echo "Result: " . ($marks >= 50 ? "Pass" : "Fail");