package model

class STR(value :Int) extends Instruction{
  var valueSTR = value
  
  override def executeOn(micro: Microprocessor): Unit = {

    micro.memory.save(value,micro.state.A)
  }
  
}