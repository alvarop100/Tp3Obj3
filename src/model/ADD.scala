package model

class ADD extends Instruction with MathInstruction{

  
  override def executeOn(micro: Microprocessor): Unit = {
    validateValueLimits(micro,"+")
    
  }

}