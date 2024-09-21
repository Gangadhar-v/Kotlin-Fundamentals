package NPTEL;

public class ExceptionHandling {
    public static void main(String[] args) {
        int i =0;
        String greeting [] = {"Hello", "hi","Hey"};
        while(i<4){
            try{
                System.out.println(greeting[i++]);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
