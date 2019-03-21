package threadtest;

public class ThreadTest_Daemon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread myThread = new MyThread();
        for (int i = 0; i < 100; i++) {
            System.out.println("main thread i = " + i);
            if (i == 20) {
                myThread.setDaemon(true);//当main线程结束，后台线程也立刻结束，后台线程只运行到i=20
                myThread.start();
            }
        }

	}

}
