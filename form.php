<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form</title>
</head>
<body>
    <?php
    $fullname = $email = $gender = $comment = $number = $age = "";
    
    if($_SERVER["REQUEST_METHOD"] == "POST") {
        $fullname = test_input($_POST["name"]);
        $email = test_input($_POST["email"]);
        $number = test_input($_POST["number"]);
        $comment = test_input($_POST["comment"]);
        $gender = test_input($_POST["gender"]);
        $age = test_input($_POST["age"]);
    }
  
    function
</body>
</html>