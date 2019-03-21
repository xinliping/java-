package callback;

/**
 * 回调测试，原文出处http://www.cnblogs.com/xrq730/p/6424471.html
 */
public class callbacktest {
	
	public static void main(String[] args) throws InterruptedException {
        student student = new Ricky();
        teacher teacher = new teacher(student);
        teacher.question();
    }


    
}
