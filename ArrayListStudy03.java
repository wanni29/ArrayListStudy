import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayListStudy03 {

    public static void main(String[] args) {
        // 학생 성적을 저장하는 HashMap 생성
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alice", 85);
        studentScores.put("Bob", 92);
        studentScores.put("Charlie", 78);
        studentScores.put("David", 95);
        studentScores.put("Eve", 88);
        studentScores.put("Frank", 72);

        // 성적이 80 이상인 학생 이름 수집
        List<String> topPerformers = studentScores.entrySet().stream()
                .filter(enytry -> enytry.getValue() >= 80)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        // 결과 출력
        System.out.println("Top performers : ");
        for (String studenet : topPerformers) {
            System.out.println(studenet);
        }
    }

}
