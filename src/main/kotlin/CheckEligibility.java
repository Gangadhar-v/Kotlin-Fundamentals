

//blueprint consist of properties and method
public class CheckEligibility {


    //class properties


    public void isEligibleToVote(int age, String name){

       if(age>=18){
           System.out.println(name+" your are eligible to vote");
       }
       else   System.out.println(name + "your are not eligible to vote");


    }






    public static void main(String[] args) {

        //object create


        CheckEligibility object = new CheckEligibility();

        object.isEligibleToVote(18,"krishnaveni v");

    }
}