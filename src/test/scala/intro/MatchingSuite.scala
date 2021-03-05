package org.apz.intro

import org.scalatest.FunSuite
import org.apz.intro.classes.Matching


class MatchingSuite extends FunSuite {
  
  
  test("Prueba enteros: ") {
    Matching.printNum(-2)
    Matching.printNum(0)
  }
  
  test("Prueba parse tweets: ") {
    val tweet = """{"id":1,"text":"foo"}"""
    println(Matching.parseTweet(tweet))
  }
  
  
}