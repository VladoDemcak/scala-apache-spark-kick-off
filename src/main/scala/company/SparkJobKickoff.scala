package company

import org.apache.log4j._
import org.apache.spark.sql.SparkSession

object SparkJobKickoff {

  val log = Logger.getLogger(getClass.getName)

  def main(args: Array[String]) {

    val spark = SparkSession
                  .builder
                  .appName("SparkJobKickoff")
                  .master("local")
                  .getOrCreate()

    // count occurrence of values
    val slices = spark
                  .sparkContext
                  .parallelize(
                    Seq(
                      ("0", Array("a", "b", "c")),
                      ("1", Array("b", "c")),
                      ("2", Array("a", "b")),
                      ("3", Array("b", "c", "d")),
                      ("4", Array("a", "b", "c", "d"))))
                  .flatMap(_._2)
                  .map((_, 1))
                  .reduceByKey(_ + _)

    slices.foreach(x => log.info(x))

    spark.stop
  }
}
