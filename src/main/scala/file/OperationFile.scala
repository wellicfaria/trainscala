package file

import org.apache.spark.sql.{DataFrame, SparkSession}
import org.apache.spark.sql.cassandra._
import com.datastax.spark.connector.cql.CassandraConnectorConf


class OperationFile(sparkSession:SparkSession,file : File){


  def readFileCsv(): DataFrame =
  {

    val df = sparkSession.read.format("csv").option("delimiter",";").option("header", "true").load(file.getFullPath())

    return df

  }

  def writeFileInCassadra(): Unit = {

    val df = this.readFileCsv()

    df.write
      .cassandraFormat(file.getTableCassandra(), file.getKeySpaceCassandra())
      .save()

  }

}
