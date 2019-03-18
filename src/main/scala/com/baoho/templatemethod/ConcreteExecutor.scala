package com.baoho.templatemethod

case class ConcreteExecutor() extends BaseExecutor[String] {
  override protected def beforeExecute: String = {
    val data = "Hello Before Execute"
    println(data)
    data
  }

  override protected def afterExecute: String = {
    val data = "Hello After Execute"
    println(data)
    data
  }

  override protected def mainExecute: String = {
    val data = "Hello Main Execute"
    println(data)
    data
  }
}
