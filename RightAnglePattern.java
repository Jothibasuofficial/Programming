import java.util.Scanner;

/**
 * @author jothibasu
 * @blog jothibasuofficial.blogspot.com
 * @code github.com/jothibasuofficial
 */
public class RightAnglePattern {

	public static void main(String[] args) {
		
		int limit;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the limit:");
		limit = scan.nextInt();
		for(int i = 1 ; i <= limit ; i++){
			for(int j = 1 ; j<=i;j++){
				for(int k =1 ; k<=j;k++){
					System.out.print("*");
				}System.out.println("");
			}
			//This line is not necessary
			//It's just to understand output
			System.out.println("==========");
		}
		scan.close();
	}
}
