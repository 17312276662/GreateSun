package com.sun.test;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Test {

	private static final String LABEL_QUIT = "退出";
	private static final String TITLE_MAIN_FRAME = "文件管理器";
	private static final int DEFAULT_HEIGHT = 200;
	private static final int DEFAULT_WIDTH = 400;
	private static final int DEFAULT_X = 500;
	private static final int DEFAULT_Y = 100;
	
	public static void main(String[] args) {
		
		/*组件*/
		//退出按钮
		Button quitBtn = new Button();
		quitBtn.setLabel(Test.LABEL_QUIT);
		//主框架
		JFrame mainFrame = new JFrame(Test.TITLE_MAIN_FRAME);
		
		mainFrame.add(quitBtn);
		//显示框架
		mainFrame.setVisible(true);
		/*设置框架的位置*/
		mainFrame.setLocation(DEFAULT_X, DEFAULT_Y);
	
		/*设置框架大小*/
		mainFrame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		//获取本地窗口系统的相关数据
		Toolkit kit = Toolkit.getDefaultToolkit();
		//获取屏幕相关数据
		Dimension screenSize = kit.getScreenSize();
		System.out.println("the screen size is width:"+ screenSize.width + " height : " + screenSize.height);
		//设置图标
		Image img = new ImageIcon("timg.jpg").getImage();
		mainFrame.setIconImage(img);
		
		//设置最大化状态
		mainFrame.setExtendedState(Frame.MAXIMIZED_BOTH);
		//设置关闭方法，默认的是x号退出并停止程序
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//目前未看出用途，且会抛出illegalComponentStateException
		/*mainFrame.setUndecorated(true);*/
	}
}
