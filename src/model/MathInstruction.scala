

package model

trait MathInstruction {
  
   def validateValueLimits(micro:Microprocessor, opType:String){
     var method =Numeric.getClass.getMethod(opType, Numeric.getClass)
     method.invoke(micro.A :Integer, micro.B:Integer)
     
  }

  def applyInRegisters(microprocessor: Microprocessor,f: Integer => Integer => Integer): Unit ={
    micro.setA(f (micro.A,micro.B))
    micro.setB(0)
    validateValueLimits(micro)
  }
}