package model

import scala.collection.mutable

class StateContainer(micro : Microprocessor){
  var microprocessor = micro
  var states = new mutable.ArrayBuffer.fill()(0)

  def saveState(i :Int): Unit ={
    var microState = microprocessor.state
    var memoryState = microprocessor.memory.state
    states(i) = new GeneralState(microState,memoryState)
  }

  def getState(i :Int): GeneralState ={
    states(i)
  }

  def restart(): Unit ={
    states = new mutable.ArrayBuffer.fill()(0)
  }

}
