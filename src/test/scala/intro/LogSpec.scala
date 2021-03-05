package org.apz.intro

import org.scalatest.FlatSpec
import org.apz.intro.classes.LogUtils

class LogSpec extends FlatSpec {
  
     val record = "2014-03-15:10:10:31,Titanic 4000,1882b564-c7e0-4315-aa24-228c0155ee1b,58,36,39,31,15,0,TRUE,enabled,enabled,37.819722,-122.478611"
     val devId = LogUtils.getDevId(record)
     val devModel = LogUtils.getDevModel(record)
     
     
    "devId" should "1882b564-c7e0-4315-aa24-228c0155ee1b" in {
        assert(devId === "1882b564-c7e0-4315-aa24-228c0155ee1b")
    }

    "devModel" should "Titanic 4000" in {
        assert(devModel === "Titanic 4000")
    }
    
}