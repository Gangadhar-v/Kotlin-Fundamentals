object PoliticalParty{
    var voteToBjp:Int=0
    var voteToCongress:Int=0
    var voteToJds :Int=0
    var voteToNota:Int=0
init{
    println("wellcome to national election commission")
}
    fun IvoteToBjp(){
        voteToBjp++
    }
    fun IvoteToCongress(){
        voteToCongress++
    }
    fun IvoteToJds(){
        voteToJds++
    }
    fun IvoteToNota(){
       voteToNota++
    }
    fun TotalNumberOfVotes(){
        println("number of votes to bjp-->$voteToBjp " )
        println("number of votes to congess-->$voteToCongress" )
         println("number of votes to jds-->$voteToJds" )
                println("number of votes to Others-->$voteToNota")
        if(voteToBjp >3){
            println("BJP candidate is winner")
        }
        else{
            println("congress candidate is winner")
        }
    }
}

fun main() {
   PoliticalParty .IvoteToBjp()
   PoliticalParty .IvoteToBjp()
   PoliticalParty .IvoteToBjp()
   PoliticalParty .IvoteToBjp()
   PoliticalParty .IvoteToBjp()
   PoliticalParty .IvoteToCongress()
   PoliticalParty .IvoteToCongress()
   PoliticalParty .IvoteToCongress()
   PoliticalParty .IvoteToJds()
   PoliticalParty .IvoteToJds()
    PoliticalParty .IvoteToNota()
    PoliticalParty .TotalNumberOfVotes()

}