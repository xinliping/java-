package timer;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class TimerTest 
{
	public static void main(String[] args)
	{
		ActionListener listener = new TimerPrinter();
		
		Timer t = new Timer(10000, listener);
		//构造一个定时器，每隔interval毫秒，通告一次listener
		t.start();
		
		JOptionPane.showMessageDialog(null, "Quit program?");
		//显示一个包含一条消息和ok按钮的对话框
		System.exit(0);
	}
}

class TimerPrinter implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
		Date now = new Date();
		System.out.println("At the tone, the time is " + now);
		Toolkit.getDefaultToolkit().beep();
	}
}