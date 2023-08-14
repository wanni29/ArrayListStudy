import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListStudy02 {

    public static void main(String[] args) {
        // ArrayList 생성 및 요소 추가
        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Cherry");
        strings.add("Date");
        strings.add("Elderberry");
        strings.add("Fig");

        // 문자열 길이가 6이상인 문자열만 필터링
        List<String> filteredStrings = strings.stream()
                .filter(s -> s.length() >= 6)
                .collect(Collectors.toList());

        // 필터링 된 문자열을 StringBuilder를 사용하여 결합
        StringBuilder resultBuilder = new StringBuilder();

        for (String s : filteredStrings) {
            resultBuilder.append(s).append(", ");
        }
        resultBuilder.delete(resultBuilder.length() - 2, resultBuilder.length()); // 마지막에 ", " 제거

        String result = resultBuilder.toString();

        // 결과 출력
        System.out.println(result);
    }

}
