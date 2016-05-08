package model

class Memory( size : Int) {

  var state = new MemoryState(size)
  var runningProgram :Program = null
  
  def save(addr:Int, value: Int){
    if(addr>1023) throw new IllegalArgumentException("Fuera de Rango de Memoria")
    
    state.register(addr) = value
  }
  
  def loadInstruction(addr :Int) :Int ={
    if(addr>1023) throw new IllegalArgumentException("Fuera de Rango de Memoria")
    
    state.register(addr)
  }
  def load(program :Program){
    runningProgram = program
  }
  
  def getRunningProgramInstructions() :Array[Instruction] ={
    runningProgram.programInstructions
  }
  
}