

package model

class Microprocessor( m :Memory) {
  var memory =m 
  var pc=1
  var A =0
  var B =0
  
  def executeAll(instructions:Array[Instruction]){
    instructions.foreach { inst => execute(inst)}
  }

  def execute(inst: Instruction): Unit ={
    inst.executeOn(this)
    pc +=1
  }

  def setA(value :Integer){
    validateValueLimits(value)
    A=value
  }
  def setB(value :Integer){
    validateValueLimits(value)
    B=value
  }
  def validateValueLimits(value : Integer){
    if(value<Byte.MinValue || value>Byte.MaxValue){
      throw new Exception("el valor supera alguno de los limites de Byte")
    }
  }

  def load(program :Program){
    memory.load(program)
  }

  def start(){
    A = 0
    B = 0
    pc = 1
    executeAll(memory.getRunningProgramInstructions)
  }
}