package week05.saviero.id.ac.umn;
import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		int pilihan;
		
		do {
			System.out.println("--------Program Menghitung Bangun Ruang--------");
			System.out.println("1. Lingkaran");
			System.out.println("2. Persegi");
			System.out.println("3. Persegi Panjang");
			System.out.println("4. Segitiga");
			System.out.println("5. Keluar");
			System.out.println("Pilihan : ");
			pilihan = s.nextInt();
			
			switch (pilihan) {
			case 1:
				System.out.println("---------------Lingkaran------------");
				System.out.println("Masukan jari-jari lingkaran : ");
				double radius = s.nextDouble();
				System.out.println("Masukan warna : ");
				String color = s.next();
				
				Circle circle = new Circle(radius,color);
				System.out.println("Warna : " +circle.getColor());
				System.out.println("Jari-jari : " +circle.getRadius());
				System.out.println("Keliling Lingkaran : " +circle.getPerimeter());
				System.out.println("Luas Lingkaran :" +circle.getArea());
				break;
			case 2:
				System.out.println("---------------Persegi------------");
				System.out.println("Masukan panjang sisi : ");
				double side = s.nextDouble();
				System.out.println("Masukan warna : ");
				String colorSquare = s.next();
				Square square = new Square(side,colorSquare);
				System.out.println("Warna : " +square.getColor());
				System.out.println("Panjang Sisi : " +square.getSide());
				System.out.println("Keliling Persegi : " +square.getPerimeter());
				System.out.println("Luas Persegi :" +square.getArea());
				break;
			case 3:
				System.out.println("---------------Persegi Panjang------------");
				System.out.println("Masukan panjang: ");
				double length = s.nextDouble();
				System.out.println("Masukan lebar: ");
				double width = s.nextDouble();
				System.out.println("Masukan warna : ");
				String colorRect = s.next();
				Rectangle rect = new Rectangle(length, width, colorRect);
				System.out.println("Warna : " +rect.getColor());
				System.out.println("Panjang dan Lebar : " +rect.getLength()+ " & " +rect.getWidth());
				System.out.println("Keliling Persegi Panjang: " +rect.getPerimeter());
				System.out.println("Luas Persegi Panjang:" +rect.getArea());
				break;
			case 4:
				System.out.println("---------------Segitiga Siku-Siku------------");
				System.out.println("Masukan Alas: ");
				double base = s.nextDouble();
				System.out.println("Masukan Tinggi: ");
				double height = s.nextDouble();
				System.out.println("Masukan warna : ");
				String colorTri = s.next();
				Triangle Tri = new Triangle(base, height, colorTri);
				System.out.println("Warna : " +Tri.getColor());
				System.out.println("Alas dan Tinggi : " +Tri.getBase()+ " & " +Tri.getHeigth());
				System.out.println("Keliling Segitiga: " +Tri.getPerimeter());
				System.out.println("Luas Segitiga:" +Tri.getArea());
				break;
			case 5:
				System.out.println("Keluar program...");
				break;
			default:
				System.out.println("Input tidak valid");
			}
		} while (pilihan !=5);
	s.close();
	}
}
