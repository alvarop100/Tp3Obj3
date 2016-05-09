package model

class SUB extends Instruction with MathInstruction{
  


  override def executeOn(micro: Microprocessor): Unit = {
    validateValueLimits(micro,"-")
   
    
  }

  
}