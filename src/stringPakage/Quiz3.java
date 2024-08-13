package stringPakage;

public class Quiz3 {
    /**
     * 특정 문자만 뒤집기
     *  - 특수문자 제외
     * */

    public static String solution(String str){
        String answer = "";

        //string을 char 배열로 변환
        char[] s = str.toCharArray();
        int lt = 0, rt=str.length()-1; //시작점, 끝점

        while (lt<rt){

            if(!Character.isAlphabetic(s[lt])){
                //알파벳이 아닐떄
                lt++;
            }else if(!Character.isAlphabetic(s[rt])){
                rt--;
            }else{
                //값 순서 변경
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }

            answer = String.valueOf(s);

        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("S#T!EG*b@a"));//a#b!GE*T@S
    }
}
