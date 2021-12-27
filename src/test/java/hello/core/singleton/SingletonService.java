package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();  // 자기 자신을 클래스 내부에 가짐

    public static SingletonService getInstance() {
        return instance;
    }  // 조회 메서드

    private SingletonService() {}  // 기본 생성자를 private으로 선언

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
