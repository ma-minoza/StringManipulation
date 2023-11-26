package string;

public class Whitespace {
    public static void removeWhitespace(String word){
        StringBuilder builder = new StringBuilder();
        char[] array = word.toCharArray();
        for(char c : array){
            if(!Character.isWhitespace(c)){
                builder.append(c);
            }
        }

        System.out.println("Before removing whitespace : " + word);
        System.out.println("After removing whitespace : "+builder);
    }
}
