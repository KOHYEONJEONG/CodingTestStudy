package stringPakage;

public class Quiz1 {

    public static String solution(String str){
        String answer ="";
        int m = Integer.MIN_VALUE, pos;//pos는 공백까지의 길이
        while((pos=str.indexOf(' '))!=-1){//' '을 기준으로 앞에서부터 찾음
            String tmp = str.substring(0,pos);//ex: It, pos는 2
            int len = tmp.length();//현재 단어 길이

            if(len>m){
                m = len;
                answer = tmp;
            }

            str=str.substring(pos+1);//"It "을 제외한 나머지

        }//for

        if(str.length()>m){//마지막 단어까지 확인하는 방법
            answer=str;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("It is time to study"));
    }
}
