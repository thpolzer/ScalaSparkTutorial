import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.{SparkSession, SQLContext}
import org.apache.spark.rdd.RDD
import sparkdetails.Sparksettings
import rdds.ParallelizedRDD
import rdds.ExternalSourceRDD

object Main extends App {

  override def main(args: Array[String]): Unit = {

    val sparkconf = new Sparksettings()
    val sc = sparkconf.sparkconfig._2
    val prdd = new ParallelizedRDD(sc)
    val p1 = prdd.createRDD()
    val p2 = prdd.doFilter(sc.parallelize(p1))
    val p3 = prdd.doUnion()

   // val extRDD = new ExternalSourceRDD(sc)


    val a = 1

  }


}
