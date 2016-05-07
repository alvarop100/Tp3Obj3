package model

class LOD(value :Integer) extends Instruction{
  
  var valueLOD = value
   override def executeOn(micro: Microprocessor): Unit = {
     var valor :Integer=micro.memory.load(valueLOD)
     micro.A=valor
    super.executeOn(micro)
  }
  
}