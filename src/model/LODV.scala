package model

class LODV (value :Int) extends Instruction{
  var valueLODV =value

  override def executeOn(micro: Microprocessor): Unit = {
    micro.setA(valueLODV)
  }
  
}