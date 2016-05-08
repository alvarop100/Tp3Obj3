package model

import model.Microprocessor
trait MathInstruction {

    def applyInRegisters(microprocessor: Microprocessor, function: (Int, Int) => Int): Unit ={
    microprocessor.setA(function (microprocessor.state.A,microprocessor.state.B))
    microprocessor.setB(0)
    validateValueLimits(microprocessor,function.toString())//lo de function.toString no va, lo puse para que tipe
  }

   def validateValueLimits(micro:Microprocessor, opType:String){
     var method =Numeric.getClass.getMethod(opType, Numeric.getClass)
     method.invoke(micro.state.A :Int, micro.state.B:Int)
     
  }

}