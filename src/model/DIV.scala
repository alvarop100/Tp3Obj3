package model

class DIV extends Instruction with MathInstruction{
  
  
  override def executeOn(micro: Microprocessor): Unit = {
    if(micro.B == 0)
    {
      throw new DivideByZeroException("No se puede dividir por 0")
    }
    validateValueLimits(micro)
  }
}