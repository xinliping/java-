package callback;

/**
 * 一个名叫Ricky的同学解决老师提出的问题，原文出处http://www.cnblogs.com/xrq730/p/6424471.html
 */
public class Ricky implements student {

    @Override
    public void answer(Callback callback,String question) {
        System.out.println("Tom正在思考！"+question);
        try {
            Thread.sleep(3000);//模拟思考过程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String answer = "2";
        System.out.println("Tom回答！"+answer);
        callback.answerCallback(answer);
    }



}