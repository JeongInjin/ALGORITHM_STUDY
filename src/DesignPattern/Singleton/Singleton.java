package DesignPattern.Singleton;
/*
* JVM의 클래스 로더 메커니즘과 클래스의 로드 시점을 이용하여
* 내부 클래스를 통해 생성 시킴으로써 쓰레드 간의 동기화 문제를 해결한다.
* 대표적인 싱글톤 패턴
* */
public class Singleton{
    //private constructor 를 이용한 인스턴스 생성 차단.
    private Singleton(){};

    private static class InstanceClass{
        public static final Singleton instance = new Singleton();
    }
    public static Singleton getInstance(){
        return InstanceClass.instance;
    }
}