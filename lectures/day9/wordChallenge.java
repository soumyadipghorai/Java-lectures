public class wordChallenge {
    static String indentifyWord(String[] strArr, char[] chrArr, String mask){
        boolean flag = false;
        char[] chrArrCopy = chrArr;
        for (int i = 0; i<strArr.length; i++){
            String word = strArr[i];
            if (word.length() == mask.length()){
                for (int j = 0; j < word.length(); j++ ){
                    boolean charFound = false;
                    if (mask.charAt(j) == '*'){
                        for (int k = 0; k < chrArrCopy.length; k++){
                            if (word.charAt(j) == chrArrCopy[k]){
                                charFound = true;
                                chrArrCopy[k] = ' ';
                            }
                        }
                        if (charFound == false){
                            break;
                        }
                    }
                    else if (word.charAt(j) != mask.charAt(j)){
                        break;
                    }
                }
            }
        }

        if (flag){
            return "None";
        }
        return "kdncd";
    }

    public static void main(String[] args){

    }
}

