import java.util.ArrayList;

public class ArrayListStudy01 {

    public static void main(String[] args) {

        // ArrayList 생성
        ArrayList<String> names = new ArrayList<>();

        // 요소 추가
        names.add("Alice");
        names.add("Bob");
        names.add("Charlue");

        // 요소 접근
        System.out.println(names.get(0)); // Alice 출력

        // 요소 수정
        names.set(1, "Betty");

        // 요소 삭제
        names.remove(2);

        // 리스트 크기
        System.out.println("Size : " + names.size()); // Size: 2출력

        // 모든 요소 출력
        for (String name : names) {
            System.out.println(name);
        }
    }

}
