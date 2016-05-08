package model

class SWAP extends Instruction {
  
  override def executeOn(micro: Microprocessor): Unit = {
    
    var temp= micro.state.A
    micro.setA(micro.state.B)
    micro.setB(temp)
  }
}