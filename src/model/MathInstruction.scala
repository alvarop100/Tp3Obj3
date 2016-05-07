

package model

trait MathInstruction {
  
   def validateValueLimits(micro:Microprocessor){
     if(micro.A> Byte.MaxValue )
    {
      micro.setB(micro.A- Byte.MaxValue)
      micro.setA( Byte.MaxValue)
    }
    if(micro.A < Byte.MinValue){
      micro.setB(micro.A+ Byte.MinValue)
      micro.setA( Byte.MinValue)
    }
  }
}