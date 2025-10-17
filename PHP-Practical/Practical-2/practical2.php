<!-- 2. Variables, Constants, Data Types, Echo and Print -->

<?php
define("APP_NAME", "My PHP Demo");     // constant
$name = "Depinder";                    // string
$age  = 20;                            // integer
$height = 5.9;                         // float
$isStudent = true;                     // boolean

echo "App: " . APP_NAME . "<br>";
echo "Name: $name<br>";
print "Age: $age<br>";
echo "Height: $height<br>";
echo "Student? " . ($isStudent ? "Yes" : "No");