package C08Thread;

public class Library {
    private static int bookcount = 100;
    //    stnchronized : 메서드내에서 1개의 스레드만을 실행되도록 보장 .
//    public synchronized static void borrow(){
    public static void borrow(){
        if(bookcount>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            bookcount-=1;
            System.out.println("대출완료");

        }else{
            System.out.println("대출불가");
        }
    }
    public static int getBookcount(){
        return bookcount;
    }

}