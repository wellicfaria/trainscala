package cassandra

import com.datastax.spark.connector.cql.CassandraConnectorConf
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.cassandra._
import com.datastax.spark.connector.cql.CassandraConnectorConf


class Cassandra(spark : SparkSession) {

  def openConection(): Unit = {

    val port_cassandra = 9042
    val server_cassandra = "127.0.0.1"

    spark.setCassandraConf("Cluster1", CassandraConnectorConf.ConnectionHostParam.option(server_cassandra) ++ CassandraConnectorConf.ConnectionPortParam.option(port_cassandra))

  }




}
