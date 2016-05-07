package model

class LODV (value :Integer) extends Instruction{
  var valueLODV =value

  override def executeOn(micro: Microprocessor): Unit = {
    micro.A=valueLODV
    super.executeOn(micro)
  }
  
}