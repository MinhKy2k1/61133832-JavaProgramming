/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập b: ");
		double b = scanner.nextDouble();
		System.out.print("Nhập c: ");
		double c = scanner.nextDouble();
		
		double delta = b*b-4*a*c;
		
		if(delta<0) {
			System.out.printf("Phương trình ko có nghiệm");
		}else {
			double kq = Math.sqrt(delta);
			System.out.printf("Căn delta là %.1f%n",kq);
		}
		System.console();
	}

}
