package model

class SUB extends Instruction with MathInstruction{
  
  override def executeOn(micro: Microprocessor): Unit = {
    micro.setA(micro.A-micro.B)
    micro.setB(0)
    validateValueLimits(micro)
    super.executeOn(micro)
  }
  
}