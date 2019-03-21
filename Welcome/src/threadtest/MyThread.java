package threadtest;

class MyThread extends Thread {
    
//    private int i = 0;

    @Override
//    
//    public void run() {
//        for (i = 0; i < 100; i++) {
//            System.out.println(Thread.currentThread().getName() + " " + i);
//        }
//    }
    
//    threadtest_daemon程序中使用
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            System.out.println("i = " + i);
//            try {
//                Thread.sleep(1);
//            } 
//            catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
    
//  threadtest_priority程序中使用   
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
        }
    }
}
