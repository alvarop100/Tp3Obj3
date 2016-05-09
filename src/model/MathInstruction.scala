package model

trait MathInstruction {

   

   def validateValueLimits(micro :Microprocessor, opType :String){
     var method =Numeric.getClass.getMethod(opType, Numeric.getClass)

     var value =(method.invoke(micro.getA :Integer, micro.getB :Integer)).asInstanceOf[Integer]
     if(value < Byte.MinValue){
       micro.setB(value+Byte.MinValue)
       micro.setA(Byte.MinValue)
       return;
     }
      if(value > Byte.MinValue){
       micro.setB(value-Byte.MaxValue)
       micro.setA(Byte.MaxValue)
       return;
     }
      micro.setA(value)
    micro.setB(0)
   
     
  }

}