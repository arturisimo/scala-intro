package org.apz.intro

import scala.io.Source
import org.apz.intro.classes.LogUtils

/**
 * There are six instances of “Titanic 4000” model phones in the Loudacre log file.
 * Modify your solution to the last section (or start with one of the provided
ParseLines* solutions) to print out the device IDs for these six records only.
Use the Iterator.filter method to limit processing to only those lines
containing Titanic 4000 phone records.
You should get the following IDs:
27a418dc-9f20-4cb9-9c69-92d16c596bad
3d88c332-61fa-46f0-a171-84a8b02dd52a
c9b5d5d4-19a2-4259-bff7-e915d967d3f4
54994404-ab72-4e5f-a6bc-0d485b3806f2
57d50d31-ce40-440d-a2b3-a041eb9a29f5
1882b564-c7e0-4315-aa24-228c0155ee1b
 * 
 * 
 *
 */
object FilterLines {
    def main(args: Array[String]) {
        //val fname = "/home/training/training_materials/jes/data/loudacre.log"
        //sSource.fromFile(fname).TODO.TODO(_.TODO("4000")).TODO(line => println(line.TODO(',')(2)))
        
        val loudacre = getClass.getResourceAsStream("loudacre.log")
         
        Source.fromInputStream(loudacre).getLines().filter(line => LogUtils.getDevModel(line) == "Titanic 4000")
                                                   .foreach(line => println(LogUtils.getDevId(line)))
        /*                                           
        Source.fromInputStream(loudacre).getLines().filter(line => line.split(",")(1).split(" ")(1) == "4000")
                                                   .foreach(line => println(line.split(",")(2)))*/
        
    }
}