package model

class Microprocessor( m :Memory) {
  var stateContainer = new StateContainer(this)
  var state = new MicroprocessorState()
  var memory = m


  def load(program :Program){
    memory.load(program)
  }

  def start(){
    state.restart
    stateContainer.restart
    executeAll(memory.getRunningProgramInstructions)
  }

  def stop(): Unit ={
    //falta implementar bien
    throw new Exception
  }

  def executeAll(instructions:Array[Instruction]){
    instructions.foreach { inst => execute(inst)}
  }

  def execute(inst: Instruction): Unit ={
    stateContainer.saveState(state.pc)
    inst.executeOn(this)
    state.pc+=1
  }

  def executeNext(): Unit ={
    var instructions = memory.getRunningProgramInstructions
    execute(instructions(state.pc-1))
  }

  def backUltimateInstructionState(): Unit ={
    var oldState = stateContainer.getState(state.pc)
    memory.state = oldState.memoryState
    state = oldState.microState
  }

  def validateValueLimits(value : Int){
    if(value<Byte.MinValue || value>Byte.MaxValue){
      throw new Exception("El valor supera alguno de los limites de Byte")
    }
  }

  def setA(value :Int){
    validateValueLimits(value)
    state.A = value
  }

  def setB(value :Int){
    validateValueLimits(value)
    state.B = value
  }




}