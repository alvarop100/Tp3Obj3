package model

import scala.collection.mutable

class MemoryState(size: Int) {
  val register =  mutable.ArrayBuffer.fill(size)(0)
}
