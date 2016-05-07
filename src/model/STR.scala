package model

class STR(value :Integer) extends Instruction{
  var valueSTR = value
  
  override def executeOn(micro: Microprocessor): Unit = {

    micro.memory.save(value,micro.A)
  }
  
}