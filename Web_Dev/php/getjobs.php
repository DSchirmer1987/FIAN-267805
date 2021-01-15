<?php
    include "db_conn.php";

    function getJobs($conn, $id = 0){
        if($id == 0){
            $sql = "SELECT * FROM jobs";
        } else {
            $sql = "SELECT * FROM jobs WHERE job_id = '$id'";
        }
        $stmt = $conn->prepare($sql);
        $stmt->execute();
        $result = $stmt->setFetchmode(PDO::FETCH_ASSOC);
        $result = $stmt->fetchAll();
        return $result;
    }

    if($_SERVER['REQUEST_METHOD'] == "GET"){
        $jobs = getJobs($conn);
        $options = "";
        for($i=0; $i < count($jobs); $i++){
            $options .= "<option value=".$jobs[$i]['job_id'].">".$jobs[$i]['job_title']."</option>";
        }
        echo $options;
    } else if($_SERVER['REQUEST_METHOD'] == "POST"){
        $id = $_POST['id'];
        $table = "<table>".
                    "<tr>".
                        "<th>ID</th>".
                        "<th>Job</th>".
                        "<th>Mindestgehalt</th>".
                        "<th>Höchstgehalt</th>".
                    "</tr>";
        $jobs = getJobs($conn, $id);
        for($i=0; $i < count($jobs); $i++){
            $table .= "<tr>";
            foreach($jobs[$i] as $key => $value){
                $table .= "<td>$value</td>";
            }
            $table .= "</tr>";
        }
        $table .= "</table>";
        echo $table;
    }
?>