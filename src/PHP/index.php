<?php

if(isset($_GET['a'],$_GET['b'])){

    $a = $_GET['a'];
    $b = $_GET['b'];

    $sum = $a * $a + $b * $b;
    echo json_encode([
        'code' => 200,
        'message' => "Done ! ",
        'sum^2' => $sum,
        'sum' =>sqrt($sum)
    ]);

}else{


    echo json_encode([
        'code' => 400,
        'message' => "set a & b ",
    ]);


}