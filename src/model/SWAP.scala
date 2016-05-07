package model

class SWAP extends Instruction {
  
  override def executeOn(micro: Microprocessor): Unit = {
    
    var temp= micro.A
    micro.setA(micro.B)
    micro.setB(temp)
  }
}