//Ralph Gabriel B. Binua    1BSIT-5 Inter Prog

import java.util.Scanner;

public class textAnalyzer {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String text;
        int option;

        System.out.println("Text Analyzer");
        System.out.print("Enter Phrase: ");
        text = input.nextLine();

        System.out.println("\n\t OPTIONS");
        System.out.println("\n[1]\tCharacter Array Analysis");
        System.out.println("[2]\tPhrase Length");
        System.out.println("[3]\tWord Replacement");
        System.out.println("[4]\tReverse the Sentence");
        System.out.println("[5]\tCharacter Retrieval");

        System.out.println();
        System.out.print("Choose Option: ");
        option = input.nextInt();
    
        switch (option) {
            case 1:
             toCharArray(text);
                break;
            
            case 2:
                length(text);
            break;

            case 3:
                replaceAll(text);
            break;

            case 4:
                reverseString(text);
            break;

            case 5:
                charAt(text);
            break;

            default:
                break;
        }
    }

    public static int toCharArray(String word) {
        int countVowels = 0;
        for (char vowel : word.toLowerCase().toCharArray()) {
            if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
                countVowels++;
            }
        }
        System.out.println("\nWord: "+word);
             System.out.println("Number of vowels: "+countVowels);
            return countVowels;
    }
    

    public static void length(String word){
        String length = word;

        System.out.println();
        System.out.println(length);

        if(length.length()>=11){
            System.out.println("The Sentence is Long");
        }

        else if(length.length()>=6){
            System.out.println("The Sentence is Medium");
        }

        else if(length.length()>0){
            System.out.println("The Sentence is Short");
        }

        else{
            return;
        }
    }

    public static void replaceAll(String word){
        String replaceAll = word;
        String toChange,replaceWord,newName;

        System.out.println("\nWord: "+ replaceAll);
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter word you want to change: ");
        toChange = input.nextLine();

        System.out.print("Enter word to replace that word: ");
        replaceWord = input.nextLine();

        newName = replaceAll.replaceAll(toChange, replaceWord);
        System.out.println("\nOld Word: "+ replaceAll);
        System.out.println("New Word: "+ newName);
    }

    public static void reverseString(String word){
        String reverse = word;

        char [] reverseWord = reverse.toCharArray();

        for(int i = reverseWord.length-1; i>=0; i--){
            System.out.println();
            System.out.print(reverseWord[i]);
    }
}

    public static void charAt(String word){
        String charAt = word;
        char letter;

        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Word: " + charAt);
        System.out.print("Enter the index you want to Print: ");
        int index = input.nextInt();

        letter = charAt.charAt(index);
        System.out.print("Equivalent to: " + letter);
    }
}
