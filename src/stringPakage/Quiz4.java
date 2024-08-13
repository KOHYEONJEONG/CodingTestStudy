package stringPakage;

public class Quiz4 {

    /**
     * 중복 문자 제거
     * */
    public static String solution(String str){

        String answer = "";

        for(int i=0; i<str.length(); i++){

            if(str.indexOf(str.charAt(i))==i){
                answer += str.charAt(i);
            }
        }

        return answer;


    }

    public static void main(String[] args) {
        System.out.println(solution("ksekksek"));
    }
}
