
                                   /*-------TECH GANG--------*/
  enum class parties{
      BJP,
      CONGRESS,
      JDS,
      NOTA
  }
  class voteForNation {
      fun iVoteFor(party: parties) {
          println("you votted to $party")
      }
  }
  fun main(){
      val vote=voteForNation ()
      vote.iVoteFor(parties.BJP )
  }
