package NPTEL;


import java.util.Random;

interface SharedConstants{
    int NO=0;
    int YES = 1;
    int MAYBE=2;
    int LATER =3;
    int SOON =4;
    int NEVER=5;

    //no declaration on variable only initialization
    //interface object can declare and no initialization
}
class Question implements SharedConstants{
    Random rand = new Random();

    int ask(){
        int prob = (int) (100*rand.nextDouble());
        if(prob <30)
            return NO;
        else if(prob<60)
            return YES;
        else if(prob<75)
            return LATER;
        else if(prob<90)
            return SOON;
        else
            return NEVER;
    }
}
public class SwitchImp implements SharedConstants {
    static void answer(int result){
        switch (result){
            case NO:
                System.out.println("No");
                break;
            case YES:
                System.out.println("Yes");
                break;
            case MAYBE:
                System.out.println("Maybe");
                break;
            case LATER:
                System.out.println("later");
                break;
            case SOON:
                System.out.println("soon");
                break;
            case NEVER:
                System.out.println("never");
                break;
        }
    }

    public static void main(String[] args) {

        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }

}
