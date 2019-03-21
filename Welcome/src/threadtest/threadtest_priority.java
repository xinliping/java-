package threadtest;

public class threadtest_priority {
	
	 public static void main(String[] args) {
	        Thread myThread = new MyThread();
	        for (int i = 0; i < 100; i++) {
	            System.out.println("main thread i = " + i);
	            if (i == 20) {
	                myThread.setPriority(Thread.MAX_PRIORITY);
	                myThread.start();
	            }
	        }
	    }
}
