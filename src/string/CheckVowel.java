package string;

public class CheckVowel {
    public static void checkVowel(String word){
        /*if(word.toLowerCase().matches(".*[aieou].*")){
            System.out.println("Has Vowel");
        }
        else{
            System.out.println("Has No Vowel");
        }*/
        boolean check = false;
        for(int i = 0; i < word.length(); i++){
            word = word.toLowerCase();
            char letter = word.charAt(i);

            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                check = true;
                break;
            }
        }
        if(check){
            System.out.println("Has Vowel");
        }
        else{
            System.out.println("Has No Vowel");
        }
    }
}
