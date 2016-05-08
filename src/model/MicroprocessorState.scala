package model

class MicroprocessorState() {
  var pc=1
  var A =0
  var B =0

  def restart(): Unit ={
    pc=1
    A =0
    B =0
  }


}
