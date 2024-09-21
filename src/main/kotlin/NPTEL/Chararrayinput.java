package NPTEL;

import org.jetbrains.annotations.NotNull;

import java.io.CharArrayReader;
import java.io.IOException;

public class Chararrayinput {

    public static void main(String[] args) {
        String obj = "abcdefgh";
        int length = obj.length();
        System.out.println("the length of obj:"+length);
        char c[]=new char[length];
        System.out.println(c);
//        for(int i =0;i<length;i++){
//            c[i] = obj.charAt(i);
//        }

        obj.getChars(0,length,c,0);
        //src end is exclusive i.e; length-1
        CharArrayReader input1 = new CharArrayReader(c);
        CharArrayReader input2 = new CharArrayReader(c,1,4);
        int i,j;
        try{
            while((i=input1.read()) == (j= input2.read())){
                System.out.println((char) i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
