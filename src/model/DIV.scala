package model

class DIV extends Instruction{
  
  
  override def executeOn(micro: Microprocessor): Unit = {
    if(micro.B == 0)
    {
      throw new DivideByZeroException("No se puede dividir por 0")
    }
    // hacer lo mismo que el ADD
    micro.A = micro.A / micro.B
    super.executeOn(micro)
  }
}