package com.chtw.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

public class CodeUtil {
	String str = "abcdefghijklmnopqrstuvwxyz";
	Random random = new Random();

	public CodeUtil() {
		str += str+str.toUpperCase()+"0123456789";
	}
	
	public static void main(String[] args) {
		CodeUtil codeUtil = new CodeUtil();
		System.out.println(codeUtil.str);
		System.out.println(codeUtil.getCode());
	}
	
	public BufferedImage getImage(String code) {
		int width = 80;
		int height=39;
		//1. 生成验证码
		//String code = getCode();
		
		//2. 创建空的BufferedImage
		BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		
		//3. 获取画笔
		Graphics g = image.getGraphics();
		
		//4. 添加背景
		g.setColor(getColor(200, 55));
		g.fillRect(0, 0, width, height);
		
		//5. 绘制验证码
		for(int i = 0;i < code.length();i++) {
			g.setColor(getColor(0, 100));
			g.setFont(new Font("宋体",Font.BOLD,28));
			//每次画一个字符
			g.drawString(String.valueOf(code.charAt(i)), 15*i+10, 30);
		}
		
		//6. 添加干扰线
		for(int i = 0;i < 5;i++) {
			g.setColor(getColor(100, 55));
			int x1 = random.nextInt(width-2);
			int x2 = random.nextInt(width-2);
			int y1 = random.nextInt(height-2);
			int y2 = random.nextInt(height-2);
			g.drawLine(x1, y1, x2, y2);
		}
		
		//7. 干扰点
		for(int i = 0;i < 8;i++) {
			g.setColor(getColor(100, 55));
			int x = random.nextInt(width-2);
			int y = random.nextInt(height-2);
			g.fillOval(x, y, 5, 5);
		}
		
		return image;
	}
	
	/**随即获取元素
	 * @param start
	 * @param max
	 * @return
	 */
	public Color getColor(int start,int max) {
		int r = start+random.nextInt(max);
		int g = start+random.nextInt(max);
		int b = start+random.nextInt(max);
		return new Color(r, g, b);
	}
	
	public String getCode() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			int index = random.nextInt(str.length());
			builder.append(str.charAt(index));
		}
		return builder.toString();
	}
}
