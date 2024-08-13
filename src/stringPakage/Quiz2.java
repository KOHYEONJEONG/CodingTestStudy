package stringPakage;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz2 {
    //문자열 뒤집기

    public static ArrayList<String> solution1(int n, String[] str){
        ArrayList<String> answer = new ArrayList<String>();

         for(String x:str){// x단어
             char[] s = x.toCharArray();

             int lt=0, rt = x.length()-1;
             while (lt<rt){
                 char temp = s[lt];
                 s[lt] = s[rt];
                 s[rt] = temp;
                 lt++;
                 rt--;
             }
             String tmp = String.valueOf(s);//문자배열을 스트링화, valueOf는 static 메소드
             answer.add(tmp);
         }

        return answer;
    }

    public static ArrayList<String> solution2(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<String>();
        //StringBuilder
        for(String x:str){//x는 단어
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {

        ArrayList<String> result = solution1(3, new String[]{"apple","banana"});

        for(String r: result){
            System.out.println(r);
        }
    }
}
