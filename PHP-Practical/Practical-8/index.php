<!-- 8. Functions, Parameters, and Variable Scope -->
 
<?php
$taxRate = 0.18; 

function totalWithTax($amount) {
  global $taxRate;               
  return $amount + ($amount * $taxRate);
}

echo "Total with tax(100): " . totalWithTax(100);
