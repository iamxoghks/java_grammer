package C08Thread;

public class MyThread extends Thread{
//    스레드를 실행하면(.start)하면 Thread클래스 내에 run메서드 호출
//    그런데,Thread클래스의 run메서드는 비어있으므로, 상속받아 오버라이딩

    @Override
    public void run(){
        System.out.println("쓰레드 실행");

    }
}