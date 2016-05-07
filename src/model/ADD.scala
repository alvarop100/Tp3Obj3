package model

class ADD() extends Instruction {
  
  override def executeOn(micro: Microprocessor): Unit = {
    micro.A+=micro.B
    micro.B=0
    if(micro.A> Byte.MaxValue)
    {
      micro.B= micro.A- Byte.MaxValue
      micro.A= Byte.MaxValue
    }
    super.executeOn(micro)
  }
}