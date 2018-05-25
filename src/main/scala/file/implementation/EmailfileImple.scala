package file.implementation
import file.File

class
  EmailfileImple(
                  fileName:String ="emailfile.txt",
                  pathFile:String = "/home/scala/IdeaProjects/trainscala/src/main/scala/file/diretory/",
                  tableCassandra:String = "tabelaemail",
                  keySpaceCassandra:String = "company"
                )
  extends File(fileName,pathFile,tableCassandra,keySpaceCassandra){

}

//CREATE KEYSPACE company WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 1 };
//CREATE TABLE company.tabelaemail(nome text PRIMARY KEY, sobrenome text , email text);

