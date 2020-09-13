package sparkdetails

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.{SparkSession, SQLContext}

class Sparksettings {

  //  val sparkConf = new SparkConf().setAppName("Text extraction").setMaster("spark://ubuntu-client:7077").set("spark.cores.max", "2")
  val sparkConf = new SparkConf().setAppName("Text extraction").setMaster("local[4]")
  val sc = new SparkContext(sparkConf)
  val sparksql = SparkSession.builder().appName("App1").getOrCreate()
  def sparkconfig = Tuple3(sparkConf,sc,sparksql)

}
