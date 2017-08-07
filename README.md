This project servers as a **apache spark quick start project** for setup **apache-spark** application in scala very simply.

It is apache spark **maven project** with few dependencies and **scala** plugin to build apache spark into jar archive.

You can setup and start developing **apache spark scala application** quickly, just with 2 steps
# Steps:
1. run

 `mvn clean package`

2. and use `jar` from `\target` folder to submit job in spark

  `spark-submit --class company.SparkJobKickoff my-spark-job-0.0.1-SNAPSHOT.jar`
