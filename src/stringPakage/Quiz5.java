package stringPakage;

import java.util.ArrayList;

public class Quiz5 {

    /**
     * 회문문자열
     *  - 앞에서 읽나 뒤로 읽나 같은 문자열을 회문 문자열이라고 한다.
     *  - 같으면 YES
     *  - 틀리면 NO
     * */
    public static String solution(String str){

        str = str.toUpperCase();//전체 문자열 대문자
        String answer = "YES";

        int mid = str.length()/2;
        int len = str.length();
        for(int i=0; i<str.length()/2; i++){

            if(str.charAt(i)!=str.charAt(len-i-1)){
                answer="NO";
                return answer;
            }
        }

        return answer;


    }

    public static void main(String[] args) {
        System.out.println(solution("gotoG"));
        System.out.println(solution("gotwoG"));
        System.out.println(solution("gooG"));
    }
}
