package firstdz;

import java.util.Scanner;

import javafx.scene.Scene;

public class Main {
	private static void task1(){
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		System.out.println("Введите коэффициенты a,b,c, если ax^2 + bx + c = 0");
		Scanner in = new Scanner(System.in);
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		d = b*b - 4*a*c;
		
		if (d > 0) {
			double x1, x2;
			x1 = (-b + Math.sqrt(d)) / (2*a);
			x2 = (b + Math.sqrt(d)) / (2*a);
			System.out.println("x1 = " +x1+", x2 = " +x2);	
		}else if (d == 0){
			double x;
			x = -b / (2*a);
			System.out.println("x = " +x);
		}else{
			System.out.println("Уравнение не имеет решений");
		}
		
	}
	private static void task2(){
		double length = 0;
		double height = 0;
		double s = 0;
		double p = 0;
		System.out.println("Введите длину и высоту прямоугольника");
		Scanner in = new Scanner(System.in);
		length = in.nextDouble();
		height = in.nextDouble();
		p = 2*(length + height);
		s = length * height;
		System.out.println("Периметр данного прямоугольника =" +p+ ", а пролощадь =" +s);	
	}
	private static void task3(){
		double p = 0;
		System.out.println("Введите периметр квадрата");
		Scanner in = new Scanner (System.in);
		p = in.nextDouble();
		double side = 0;
		side = p / 4;
		System.out.println("Сторона квадрата =" +side);
	}
	private static void task4(){
		double ans = 0;
		double a = 5.6;
		double b = 3.9;
		double c = 0.2;
		double d = 0.8;
		double x = 1.8;
		double y = 3.4;
		int i = 0;
		System.out.println("По какому уравнению мы будем находить переменную ans?(1, 2, 3, 4, 5???)");
		Scanner in = new Scanner(System.in);
		i = in.nextInt();
		switch (i) {
		case 1: ans = ((b+Math.sqrt(b*b + 4*a*c))/2*a) - (Math.pow(a, 3.0)*c +Math.pow(b, -2.0));
			break;
		case 2: ans = (a/c)*(b/d) - ((a*b - c) / c*d);
			break;
		case 3: ans = x - (Math.pow(x, 3) / 3) + (Math.pow(x, 5) / 5);
			break;
		case 4: ans = ((x+y) / (y+1)) - ((x*y - 12) / (34+x));
			break;
		case 5: ans = Math.sin(Math.sqrt(x+1)) - Math.cos(Math.sqrt(x-1));
			break;
		}
		System.out.println("ans =" +ans);
	}
	public static void main(String []args) {
		task1();
		task2();
		task3();
		task4();
	}
}


