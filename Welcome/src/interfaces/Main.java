package interfaces;

public class Main {
	
	public static void main(String[] args)
	{
		YouPan youpan = new YouPan();
		youpan.read();
		youpan.write();
		
		JianPan jianpan = new JianPan();
		jianpan.read();
		jianpan.write();
	}
}
