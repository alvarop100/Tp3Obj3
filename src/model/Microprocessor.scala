

package model

class Microprocessor( m :Memory) {
  var memory =m 
  var pc=1
  var A =0
  var B =0
  
  def execute (instructions:Array[Instruction]){
    instructions.foreach { inst => inst.executeOn(this)}
  }
}