

package model

trait MathInstruction {
  
   def validateValueLimits(micro:Microprocessor, opType:String){
     var method =Numeric.getClass.getMethod(opType, Numeric.getClass)
     method.invoke(micro.A :Integer, micro.B:Integer)
     
  }
}