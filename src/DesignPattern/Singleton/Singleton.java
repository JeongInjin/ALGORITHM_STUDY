package DesignPattern.Singleton;

//클래스 로더가 초기화 하는 시점에서 정적 바인딩(컴파일 시점에서 성격이 결정)을 통해
//인스턴스 메모리에 등록해서 사용
//public class Singleton{
//    private static final Singleton instance = new Singleton();
//    private Singleton(){};
//    public static Singleton getInstance(){
//        return instance;
//    }
//}

//volatile 이나 synchronized 키워드 없이도 동시성 문제를 해결하기 때문에 성능이 뛰어납니다.
//Singleton singleton = Singleton.getInstance();

public class Singleton{
    private Singleton(){};
    private static class InnerInstanceClass{
        public static final Singleton instance = new Singleton();
    }
    public static Singleton getInstance(){
        return InnerInstanceClass.instance;
    }
}

