package com.baoho.templatemethod

object Client {
  def main(args: Array[String]): Unit = {
    val executor = ConcreteExecutor()
    executor.execute
  }
}
