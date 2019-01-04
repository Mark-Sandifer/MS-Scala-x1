import scala.swing._

class fight {
  def rng(higher:Int, lower:Int):Int = {
      var computerGuess = scala.util.Random
      var computerGuessInt = computerGuess.nextInt(higher - lower)
      return computerGuessInt
  }

  def textgap(){
      println("---")
  }

  def p_input(){
      println("> What will you do?")
      textgap
  }

  def pinitiative():Int = {
      return rng(20, 1)
  }

  def einitiative():Int = {
      return rng(20, 1)
  }
  def enemyact(){
      if(rng(20, 1) > pac){
      println("Their hit lands!")
      hit = rng(6, 1)
      playerlife = playerlife - hit
      println(s"The enemy hit you for $hit, your current life total is $playerlife")
          if(playerlife <= 0){
              combat = 0
          }
      }
  else{
      println("Their hit misses!")
  }
  }

  def action(){
      println("How do you want to act? \n1 - Attack.\n2 - Block.\n3 - Heal.")
      choice = readInt    
      choice match{ 
      case 1 => println("You attack!")
          if(rng(20, 1) > eac){
              println("Your hit lands!")
              hit = rng(6, 1)
              enemylife = enemylife - hit
              println(s"You hit the enemy for $hit, current enemy life total is $enemylife")
                  if(enemylife <= 0){
                      combat = 0
                  }
          }
          else{
              println("Your hit misses!")
          }
      case 2 => println("You block!")
          println("You prepare youself for an attack")
          pac + 2
      case 3 => println("You tend your wounds!")
          heal = rng (3, 1)
          println(s"You heal for $heal")
          playerlife = playerlife + heal
          println(s"Your current life total is $playerlife")
  }
  }

  var heal = 0
  var choice = 0
  var playeri = pinitiative
  var enemyi = einitiative
  var playerlife = 20
  var enemylife = 20
  var combat = 1
  var pstart = 0
  var estart = 0
  var pac = 13
  var eac = 13
  var hit = 0

  while(combat == 1){
      if(playeri > enemyi){
          action
          enemyact
      }
      else{
          enemyact   
          action
      }
  }
}
var ref = new fight

class UI extends MainFrame {
  title = "GUI Program #2"
  preferredSize = new Dimension(320, 240)
  contents = Button("Attack") { println(ref.action) }
}

object GuiProgramTwo {
  def main(args: Array[String]) {
    val ui = new UI
    ui.visible = true
  }
}
