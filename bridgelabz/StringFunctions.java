class StringFunctions{

    static String isAnagram_Msg = "String are Anagram";

    static String isNotAnagram_Msg = "String are not Anagram";

	static char[] stringArray(String str){
        int length = str.length();
        char[] mString = new char[length];
        for(int i =0; i < length; i++){
            mString[i] = str.charAt(i);
        }
        return mString;
    }
	 static boolean isAnagram(String str1, String str2){

        boolean mAnagram = false;

        int lengthFirst = str1.length();
        int lengthSecond = str2.length();

        if(lengthFirst == lengthSecond) {

            for (int i = 0; i < lengthFirst; i++) {

                for (int j = 0; j < lengthFirst; j++) {

                    if (str1.charAt(i) == str2.charAt(j)) {

                        mAnagram = true;
                        break;
                    }
                }
            }
        }
        return mAnagram;
    }
 public static void main(String args[]){

        String mString1 = args[0];
        String mString2 = args[1];

        boolean mAnagramMsg = isAnagram(mString1,mString2);

        if(mAnagramMsg)
            System.out.println(isAnagram_Msg);
        else
            System.out.println("");
   }
}


	
		
