package model

class ADD extends Instruction with MathInstruction{

  override def executeOn(micro: Microprocessor): Unit = { applyInRegisters(micro,_+_) }
}