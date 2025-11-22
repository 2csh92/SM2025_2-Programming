package ch06.sec11.exam01;

public class KoreanExample {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 객체 생성 시 주민등록번호와 이름 초기화
        Korean k1 = new Korean("123456-1234567", "감자바");

        // 필드 값 읽기
        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        // final 필드는 값을 변경할 수 없음
        // k1.nation = "USA"; // (컴파일 에러 발생)
        // k1.ssn = "123-12-1234"; // (컴파일 에러 발생)

        // final 필드가 아닌 필드는 변경 가능
        k1.name = "김자바";
        System.out.println(k1.name);
    }
}