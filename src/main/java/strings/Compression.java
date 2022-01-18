package strings;

/*
String Compression:
        Implement a method to perform basic string compression using the counts
        of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
        "compressed" string would not become smaller than the original string, your method should return
        the original string. You can assume the string has only uppercase and lowercase letters (a - z).
*/

public class Compression {

    private String compressionString(String origin){
        String result = "";
        int size = origin.length();
        int index = 0;
        char repeat = ' ';
        int countByChar = 1;

        for(;index<size-1;index++){
            repeat = origin.charAt(index);
            if(repeat != origin.charAt(index+1)){
                result = result + repeat + countByChar;
                countByChar = 1;
            }else{
                countByChar++;
            }
        }
        if(repeat != origin.charAt(index)){
            countByChar = 1;
        }
        result = result + repeat + countByChar;
        if(result.length() >= size){
            return origin;
        }
        return result;

    }

    public static void main(String [] args){
        Compression compression = new Compression();
        String result = compression.compressionString("aabcccccaaa");
        System.out.println(result);
    }


}
