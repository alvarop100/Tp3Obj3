package model

import scala.collection.mutable

class Memory( size : Integer) {
  
  val register =  mutable.ArrayBuffer.fill(size)(0)
  
  def save(addr:Integer, value: Integer){
    if(addr>1023) throw new IllegalArgumentException("Fuera de Rango de Memoria")
    
    register(addr) = value
    
  }
  
  def load(addr :Integer) :Integer ={
    if(addr>1023) throw new IllegalArgumentException("Fuera de Rango de Memoria")
    
    register(addr) 
  }
  
}