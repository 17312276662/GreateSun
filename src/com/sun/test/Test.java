package com.sun.test;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test {

	private static final String LABEL_QUIT = "�˳�";
	private static final String TITLE_MAIN_FRAME = "�ļ�������";
	private static final int DEFAULT_HEIGHT = 200;
	private static final int DEFAULT_WIDTH = 400;
	private static final int DEFAULT_X = 500;
	private static final int DEFAULT_Y = 100;
	
	public static void main(String[] args) {
		
		/*���*/
		//�˳���ť
		Button quitBtn = new Button();
		quitBtn.setLabel(Test.LABEL_QUIT);
		//�����
		JFrame mainFrame = new JFrame(Test.TITLE_MAIN_FRAME);
		
		mainFrame.add(quitBtn);
		//��ʾ���
		mainFrame.setVisible(true);
		/*���ÿ�ܵ�λ��*/
		mainFrame.setLocation(DEFAULT_X, DEFAULT_Y);
	
		/*���ÿ�ܴ�С*/
		mainFrame.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		//��ȡ���ش���ϵͳ���������
		Toolkit kit = Toolkit.getDefaultToolkit();
		//��ȡ��Ļͼ���������
		Dimension screenSize = kit.getScreenSize();
		System.out.println("the screen size is width:"+ screenSize.width + " height : " + screenSize.height);
		//����ͼ��
		Image img = new ImageIcon("timg.jpg").getImage();
		mainFrame.setIconImage(img);
		
		//���»���
		mainFrame.repaint();
		//����ı����ݣ�panel����������
		mainFrame.add(new HelloPanel());
		//�������״̬
		mainFrame.setExtendedState(Frame.MAXIMIZED_BOTH);
		//���ùرշ�����Ĭ�ϵ���x���˳���ֹͣ����
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Ŀǰδ������;���һ��׳�illegalComponentStateException
		/*mainFrame.setUndecorated(true);*/
	}
}
class HelloPanel extends JPanel{

	@Override
	protected void paintComponent(Graphics g) {
		
		//�������ݣ�����߾��룬���ϱ߾���
		g.drawString("this is the containt of  this panel !", 0, 50);
	}
	
	
	
}