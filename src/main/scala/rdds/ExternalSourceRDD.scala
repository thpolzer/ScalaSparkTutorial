package rdds

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.rdd.RDD

class ExternalSourceRDD (sc: SparkContext) {

  private val this.sc = sc

  val path = "/home/ubuntu/IdeaProjects/ScalaSparkTutorial/src/main/testdata/"
 // val income_rdd = sc.textFile(path+"income.csv",minPartitions = 2)
  val income_rdd = sc.textFile(path+"income.csv",minPartitions = 2).filter(line => !line.split(",")(1).equals("vorname")).collect()




  val a = 1

}
