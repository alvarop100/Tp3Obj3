
package tests



import model.SWAP
import model.Program
import model.LODV;
import  org.junit.Assert._;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import model.Microprocessor
import model.Memory
import model.DivideByZeroException
import model.NOP
import model.ADD
import model.Instruction
import model.STR
import model.LOD
import model.DivideByZeroException
import model.DivideByZeroException
import model.DivideByZeroException
import model.DIV
import model.Program


 class TestMicroprocesador {

	var micro :Microprocessor =_
	var memory :Memory =_
	
	@Before
	def   setUp() {
	 memory = new Memory(1024)
	 micro = new Microprocessor(memory)
	 
	}

	@After
	def tearDown()  {
	  memory = null
	  micro= null
	}

	@Test
	def testPc3PositionsByThreeNOP() {
	  var nop = new NOP()
	  var inst= Array[Instruction](nop,nop,nop)
		micro.execute(inst)
		assertEquals(micro.pc, 4)
	}
	
	@Test
	def testEvaluateAdditionOfRegisters() {
		var inst = Array[Instruction](new LODV(10),new SWAP(),new LODV(22),new ADD())
		micro.execute(inst)
		assertEquals(micro.B,0)
		assertEquals(micro.A,32)
	}
	
	@Test
	def testEvaluateAdditionOfRegistersOverpassMaxValue() {
		var inst = Array[Instruction](new LODV(100),new SWAP(),new LODV(50),new ADD())
		micro.execute(inst)
		assertEquals(micro.A, 127)
		assertEquals(micro.B, 23)
	}
	
	@Test  ( expected = classOf[DivideByZeroException])
	def testDivideByZeroThrowException() {
		var inst = Array[Instruction](new LODV(0),new SWAP(),new LODV(2),new DIV())
		micro.execute(inst)
	}
	
	@Test
	def testEvaluateAdditionOfThreeRegisters() {
		var inst = Array[Instruction](new LODV(2),new STR(0), new LODV(8),new SWAP(),new LODV(5),new ADD(), new SWAP(),new LOD(0), new ADD())
		micro.execute(inst)
		assertEquals(micro.A,15)
		assertEquals(micro.B,0)
	}
	
	@Test
	def testLoadAProgramInMemory() {
	  var inst = Array[Instruction](new LODV(2),new STR(0), new LODV(8),new SWAP(),new LODV(5),new ADD(), new SWAP(),new LOD(0), new ADD())
		
		var program =new Program("Excell" , inst)
	  micro.load(program)
	  assertEquals(memory.runningProgram, program)
	      
	}
	
	@Test
	def testStartMicro() {
	  var inst = Array[Instruction](new LODV(2),new STR(0), new LODV(8),new SWAP(),new LODV(5),new ADD(), new SWAP(),new LOD(0), new ADD())
		
		var program =new Program("Excell" , inst)
	  micro.load(program)
	  micro.start
	  assertEquals(micro.A,15)
		assertEquals(micro.B,0)
	      
	}
	

}