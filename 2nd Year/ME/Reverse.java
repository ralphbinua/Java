package dsa;

public class reverse {

   String word;

   public String hello(String word) {

       String word1 = word;
       char [] wordArray = word1.toCharArray();


       for(int i = wordArray.length-1; i>=0; i--){
           System.out.print(wordArray[i]);
       }
       return word;
   }
}
