package run;

import java.applet.*;
import java.awt.*;

public class Example1_2 extends Applet{
	
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.drawString("Hello world !", 10, 20);
		g.setColor(Color.red);
		g.drawString("Hello world !", 10, 50);
		
		// unicode 所有字符都可以定义变量
		int 测试 = 1;
		g.drawString(String.valueOf(测试), 10, 70);
	}

}
