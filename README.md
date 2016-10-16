This project servers as **apache spark kick-off** for setup **apache-spark** application in scala very simply.

It is **apache spark maven project** with few dependencies and scala plugin to build apache spark into jar archive.


# Steps:
1. run

 `mvn clean package`

2. and use `jar` from `\target` folder to submit job in spark

  `spark-submit --class company.SparkJobKickoff my-spark-job-0.0.1-SNAPSHOT.jar`