<!-- 12. Multidimensional Arrays and foreach Loop -->

<?php
$students = [
  ["name"=>"Aman","marks"=>85],
  ["name"=>"Rana","marks"=>92],
  ["name"=>"Depinder","marks"=>88],
];
foreach ($students as $s) {
  echo $s["name"].": ".$s["marks"]."<br>";
}
