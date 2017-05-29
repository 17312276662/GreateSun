package com.sun.test;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 处理2D图形测试
 * @author sunmj
 *
 */
public class GraphiTuDTest {

	public static void main(String[] args) {
		
		MyFrame f = new MyFrame();
		
		 f.setVisible(true);
		 f.add(new MyPanel());
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

class MyFrame extends JFrame{
	
	private static final int DEFAULT_WIDTH=600;
	private static final int DEFAULT_HEIGHT=300;
	
	public MyFrame(){
		
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}

/**
 * 2D图像处理类
 * @author sunmj
 *
 */
class MyPanel extends JPanel{

	@Override
	protected void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D)g;
		
		/**
		 * 矩形
		 * @param 左边距，上边距，宽，高
		 */
		Rectangle2D rect = new Rectangle2D.Float(100f, 10f, 200f, 100f);
		
		/**
		 * 椭圆
		 * 通过外接矩形来画椭圆
		 */
		Ellipse2D eli = new Ellipse2D.Float(100f, 10f, 200f, 100f);
		
		Line2D line = new Line2D.Float(300f, 10f, 100f, 110f);
		g2.draw(rect);
		g2.draw(eli);
		g2.draw(line);
	}
	
	
}