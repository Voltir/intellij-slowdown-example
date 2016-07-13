//Step 1) Delete this cats.data.Xor import
import cats.data.Xor
import freek._

object DSL0 {
  sealed trait DSL[A]
  case class OhNo(i: String) extends DSL[Int]
}

object DSL1 { sealed trait DSL[A] }
object DSL2 { sealed trait DSL[A] }
object DSL3 { sealed trait DSL[A] }
object DSL4 { sealed trait DSL[A] }
object DSL5 { sealed trait DSL[A] }

object Service {
  type PRG =
    DSL0.DSL :|: DSL1.DSL :|: DSL2.DSL :|: DSL3.DSL :|: DSL4.DSL :|: DSL5.DSL :|: FXNil

  val prg = for {
    //Step 2) Uncomment the next line:
    //a <- DSL0.OhNo("Test").freek[PRG]
  } yield ???
}

object Main extends App {
  override def main(args: Array[String]): Unit = {
    //Step 3) use intellij's auto import to re-add Xor
    //(Alt+Enter) in linux
    val boom: Xor[String, Int] = Xor.Left("Boom")
    println(boom)
  }
}
