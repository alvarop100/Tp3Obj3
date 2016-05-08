package model

class DIV extends Instruction with MathInstruction{
  
  
  override def executeOn(micro: Microprocessor): Unit = {
    if(micro.state.B == 0)
    {
      throw new DivideByZeroException("No se puede dividir por 0")
    }
    applyInRegisters(micro,_/_)
  }
}