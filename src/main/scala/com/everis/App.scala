package com.everis

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.cassandra._
import cassandra.{Cassandra, _}
import com.datastax.spark.connector.cql.CassandraConnectorConf
import com.datastax.spark.connector.rdd.ReadConf
import file.implementation.EmailfileImple
import file.OperationFile

/**
 * @author ${user.name}
 */
object App {



  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {


    val spark = SparkSession
      .builder()
      .master("local")
      .appName("AppWell")
      .getOrCreate()

    val cassandra = new Cassandra(spark)
    cassandra.openConection()

    val arquEmail = new EmailfileImple()

    val operationFilearquEmail = new OperationFile(spark,arquEmail)

    operationFilearquEmail.writeFileInCassadra()



  }

}
