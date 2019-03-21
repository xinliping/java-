package callback;

/**
 * 老师对象，原文出处http://www.cnblogs.com/xrq730/p/6424471.html
 */
public class teacher implements Callback {

	student student;
	 
    public teacher(student student) {
        this.student = student;
    }
 
    public void question() throws InterruptedException {
        //异步回调
        new Thread(new Runnable() {
            @Override
            public void run() {
                String question = "1+1=？";
                System.out.println("教师提问！"+question);
                student.answer(teacher.this,question);
            }
        }).start();
        Thread.sleep(1000);//让教师提问线程先执行
        System.out.println("教师继续去干别的事情！");
    }
 
    @Override
    public void answerCallback(String answer) {
        System.out.println("教师得到回答！答案是："+answer+"教师可以打分了");
    }


    
}