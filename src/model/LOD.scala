package model

class LOD(value :Int) extends Instruction{
  
  var valueLOD = value
   override def executeOn(micro: Microprocessor): Unit = {
     var valor :Int=micro.memory.loadInstruction(valueLOD)
     micro.setA(valor)
  }
  
}