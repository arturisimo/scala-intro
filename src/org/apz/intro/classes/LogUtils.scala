package org.apz.intro.classes

object LogUtils {
    def getDevId(logline:String) = logline.split(',')(2).trim
    def getDevModel(logline:String) = logline.split(',')(1).trim
}