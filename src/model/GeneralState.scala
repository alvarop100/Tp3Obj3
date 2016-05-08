package model

class GeneralState(microprocessorState: MicroprocessorState,mState: MemoryState) {
  var microState = microprocessorState //aca hayq ue ver como clonar de alguna manera sin tener la misma referencia
  var memoryState = mState
  //falta guardar el estado del la memoria

}
