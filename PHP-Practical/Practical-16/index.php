<!-- 16. HTML Form Handling using POST Method and Validation -->

<?php
$email = filter_input(INPUT_POST,'email',FILTER_VALIDATE_EMAIL);
$age   = filter_input(INPUT_POST,'age',FILTER_VALIDATE_INT);
if(!$email) die("Invalid email");
if($age===false || $age<1) die("Invalid age");
echo "Saved: $email (Age $age)";
