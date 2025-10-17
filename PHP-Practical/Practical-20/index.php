<!-- 20. PHP and MySQL Integration using PDO (CRUD Example) -->

<?php
$dsn  = "mysql:host=localhost;dbname=college;charset=utf8mb4";
$user = "root";
$pass = "";

// Connect
try {
  $pdo = new PDO($dsn, $user, $pass, [
    PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION
  ]);
  echo "Connected!<br>";
} catch(PDOException $e) {
  die("DB error: " . $e->getMessage());
}

// Create table (if not exists)
$pdo->exec("
  CREATE TABLE IF NOT EXISTS students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    marks INT NOT NULL
  )
");

// Insert sample row (prepared)
$stmt = $pdo->prepare("INSERT INTO students(name, marks) VALUES (?, ?)");
$stmt->execute(["Depinder Singh", 88]);

// Fetch rows
$q = $pdo->query("SELECT id, name, marks FROM students ORDER BY id DESC");
$rows = $q->fetchAll(PDO::FETCH_ASSOC);

// Show
echo "<h3>Students</h3><pre>";
print_r($rows);
echo "</pre>";
