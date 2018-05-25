package file

class File (fileName:String , pathFile:String,tableCassandra:String, keySpaceCassandra:String){

  def getFileName(): String = {
    fileName
  }

  def getPathFile(): String = {
    pathFile
  }

  def getFullPath(): String = {
    pathFile.concat(fileName)
  }

  def getTableCassandra(): String = {
    tableCassandra
  }

  def getKeySpaceCassandra():String = {
    keySpaceCassandra
  }
}
