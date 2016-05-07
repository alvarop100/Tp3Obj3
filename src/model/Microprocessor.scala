

package model

class Microprocessor( m :Memory) {
  var memory =m 
  var pc=1
  var A =0
  var B =0
  
  def execute (instructions:Array[Instruction]){
    instructions.foreach { inst => inst.executeOn(this)}
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
}