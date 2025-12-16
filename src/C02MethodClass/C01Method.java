package C02MethodClass;

public class C01Method {
    public static void main(String[] args) {
//        for 1~10 토탈
        int total = 0;
        for (int i = 1; i < 11; i++) {
            total += i;
        }
        System.out.println(total);

        int total2 = 10;
        for (int i = 10; i < 21; i++) {
            total2 += i;
        }
        System.out.println(total2);



        int method = C01Method.getTotal(1, 10);
        int method2 = getTotal(10, 20);

        System.out.println("method: " + method + ", method2: " + method2);
    }

    // code 중복 지속되면 반복을 피하기 위해 코드를 모듈화 하겠다
    // method 기본 호출은 클래스명.메서드명() 또는 객체명.메서드명()
    // 같은 파일 안이라면 클래스명 필요 없음
    // 접근제어자 public
    // 클래스매서드(static) 객체매서드(static 안씀)
    // 반환 타입 int, String, {}, void ....
    // 매개변수 타입이나 개수
    public static int getTotal(int a, int b) {
        int total = 0;
        for(int i = a; i <= b; i++) {
            total += i;
        }
        return total;
    }

}
