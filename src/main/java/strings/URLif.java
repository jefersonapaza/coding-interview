package strings;

/*
URLify:
        Write a method to replace all spaces in a string with %20. You may assume that the string
        has sufficient space at the end to hold the additional characters, and that you are given the true
        length of the string. (Note: If implementing in Java, please use a character array so that you can
        perform this operation in place.)

*/


public class URLif {


    private String replaceSpaces(char [] origin,int size){
        String result = "";
        String replace = "%20";
        for(int i= 0; i< size ; i++){
            if(origin[i] != ' '){
                result += origin[i];
            }else{
                result += replace ;
            }
        }
        return result;
    }

    public static void main(String [] args){
        URLif urlIf = new URLif();
        String result = urlIf.replaceSpaces("Mr Jhon Smith   ".toCharArray(),13);
        System.out.println(result);
    }
}
