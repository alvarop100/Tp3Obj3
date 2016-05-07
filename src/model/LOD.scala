package model

class LOD(value :Integer) extends Instruction{
  
  var valueLOD = value
   override def executeOn(micro: Microprocessor): Unit = {
     var valor :Integer=micro.memory.loadInstruction(valueLOD)
     micro.setA(valor)
    super.executeOn(micro)
  }
  
}