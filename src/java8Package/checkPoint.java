package java8Package;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


interface MyInterface{
    default void print(){
        System.out.println("myInterface");
    }
}


public class checkPoint {
    public static void main(String[] args) {

        //lambda 표현식
        List<String> names = Arrays.asList("Alice","Bob","Charlie");
        names.forEach(name -> System.out.println(name));

        //Stream API
        List<String> filteredNames = names.stream()
                                    .filter(name -> name.startsWith("A"))
                                    .collect(Collectors.toList());


        MyInterfaceImpl myInterface = new MyInterfaceImpl();
        myInterface.print();//myInterface

        LocalDate date = LocalDate.now();
        LocalDate nextweek = date.plus(1, ChronoUnit.WEEKS);

        Optional<String> name =  Optional.ofNullable("Alice");
        name.ifPresent(System.out::println);

        //지역 변수 타입 추론을 위해 'var' 키워드가 도입되어, 타입을 명시하지 않아도 컴파일러가 자동으로 타입을 추론
        String nameVar=" Hello";
        nameVar = nameVar.strip();//공백
        System.out.println(nameVar);//Hello
        System.out.println(nameVar.isBlank());//공백 문자열 여부 확인

        List<String> list = List.of("one","two","three");
        list.stream().map((var s)->s.toLowerCase()).forEach(System.out::println);

        //단어 단위로 스트림 처리
        String sentence = "Java is awesome";
        Stream<String> wordStream = Arrays.stream(sentence.split(" "));
        wordStream.forEach(System.out::println);

    }
}
