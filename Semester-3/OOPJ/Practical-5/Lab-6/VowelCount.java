// 4. Create a class which ask the user to enter a sentence, and it should display count of each vowel type in the sentence. The program should continue till user enters a word “quit”. Display the total count of each vowel for all sentences. [B]

public class VowelCount 
{
    public static void main(String[] args) {
        int count=0;
        for(int i=0; i<args.length; i++)
        {
            if(args[i]!="quit") 
            {
                for(int j=0; j<args[i].length(); j++)
                {
                    if(args[i].charAt(j)=='a' || args[i].charAt(j)=='e' || args[i].charAt(j)=='i' || args[i].charAt(j)=='o' || args[i].charAt(j)=='u' || args[i].charAt(j)=='A' ||
                    args[i].charAt(j)=='E' || args[i].charAt(j)=='I' || args[i].charAt(j)=='O' || args[i].charAt(j)=='U')
                    {
                        count++;     
                    }
                }    
            }
        }
        System.out.println("Vowel : "+count);
    }
}