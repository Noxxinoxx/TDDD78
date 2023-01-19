package noxtddd78;
import javax.swing.JOptionPane;
public class main9 {
	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("Please input a value");
		
		System.out.println(findRoot(Double.parseDouble(x)));
	}
	
	
	public static double findRoot(double x) {
		double guess = x;
		for(int i = 0; i <= 10; i++) {
			guess -= (guess*guess-x) / (2*guess);
		}
		return guess;
	}
}
