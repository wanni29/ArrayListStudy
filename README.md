# ArrayList의 기본 개념

- 가변 크기의 배열을 구현하는 클래스
- 동적 배열기반의 리스트 자료구조
- 동적 배열이란 크기를 미리지정하지 않고 크기가 자동으로 조절
- 리스트에 요소를 추가하거나 삭제할때 유용

```java
    // 기본 문법
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
```