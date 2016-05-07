package model

class SWAP extends Instruction {
  
  override def executeOn(micro: Microprocessor): Unit = {
    
    var temp= micro.A
    micro.A=micro.B
    micro.B=temp
    super.executeOn(micro)
  }
}