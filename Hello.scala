import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object Hello extends App{
	println("Hello world")

	val conf = new SparkConf().setAppName("MyApp").setMaster("local[2]")
	val sc = new SparkContext(conf)
	val data = Array(1, 2, 3, 4, 5)
	val distData = sc.parallelize(data)
}