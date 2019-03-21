package interfaces;


public class YouPan implements USB {
	
	public void read()
	{
		System.out.println("U盘正在读取...");
	}

	public void write()
	{
		System.out.println("U盘正在写入...");
	}

}
