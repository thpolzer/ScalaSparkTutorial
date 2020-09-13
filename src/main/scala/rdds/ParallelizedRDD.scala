package rdds
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.rdd.RDD

class ParallelizedRDD (sc: SparkContext) {

  private val this.sc = sc
  private val list = List (3,7,2,12,24,17)
  private val list1 = List (3,100,102)

  // Important: You can only create a paralellized RDD on  a sequence collection

  def createRDD():Array[Int]= {
    val simpleRDD = sc.parallelize(list)
    val transformedRDD = simpleRDD.map(x => x+2)
    val result = transformedRDD.collect()
    return result
  }

  def doFilter(rdd: RDD[Int]) : Array[Int] = {
    val filteredRDD = rdd.filter(x => x > 10).collect()
    val reduceRDD = rdd.reduce(_+_)
    return filteredRDD
  }

  def doUnion(): Array[Int] = {
    val unionRDD = sc.parallelize(list).union(sc.parallelize(list1))
    val result = unionRDD.collect()
    return result
  }

}
