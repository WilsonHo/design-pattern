package com.baoho.templatemethod

trait BaseExecutor[T] {
  protected def beforeExecute: T

  protected def afterExecute: T

  protected def mainExecute: T

  final def execute: T = {
    beforeExecute
    mainExecute
    afterExecute
  }
}
