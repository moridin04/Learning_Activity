

public class Exercise30_11 {
  public static Object s1 = new Object();
  public static Object s2 = new Object();

  public static void main(String[] args) {
    Thread t1 = new Thread() {
      public void run() {
    	  while (true) {
        synchronized (s1) {
          System.out.println("Thread 1 acquired lock1");
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {}
          synchronized (s2) {
            System.out.println("Thread 1 acquired lock2");
          }
        }
      }
    }
    };

    Thread t2 = new Thread() {
      public void run() {
        synchronized (s2) {
          System.out.println("Thread 2 acquired lock2");
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {}
          synchronized (s1) {
            System.out.println("Thread 2 acquired lock1");
          }
        }
      }
    };

    t1.start();
    t2.start();
  }
}
