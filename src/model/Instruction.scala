package model

abstract class Instruction {
  
  def executeOn(micro :Microprocessor){
    micro.pc+=1
  }
  
}