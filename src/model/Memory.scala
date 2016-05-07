package model

import scala.collection.mutable

class Memory( size : Integer) {
  
  val register =  mutable.ArrayBuffer.fill(size)(0)
  var runningProgram :Program = null
  
  def save(addr:Integer, value: Integer){
    if(addr>1023) throw new IllegalArgumentException("Fuera de Rango de Memoria")
    
    register(addr) = value
    
  }
  
  def loadInstruction(addr :Integer) :Integer ={
    if(addr>1023) throw new IllegalArgumentException("Fuera de Rango de Memoria")
    
    register(addr) 
  }
  def load(program :Program){
    runningProgram = program
  }
  
  def getRunningProgramInstructions() :Array[Instruction] ={
    runningProgram.programInstructions
  }
  
}