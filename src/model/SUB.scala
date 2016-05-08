package model

class SUB extends Instruction with MathInstruction{
  
  override def executeOn(micro: Microprocessor): Unit = { applyInRegisters(micro,_-_) }
  
}