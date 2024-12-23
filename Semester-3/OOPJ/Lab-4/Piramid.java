// 5. Write an interactive program to print a string entered in a pyramid form. For instance, the string "stream" has to be displayed as follows:[A] 
// s 
// st 
// str 
// stre 
// strea 
// stream

import java.util.*;
public class Piramid {
    public static void main(String[] args) {
        String str = "stream";

        for(int i=1;i<=str.length();i++){
            System.out.println(str.substring(0, i));
        }
    }
}
        
