/*This program displays a countdown from 10 to 0, while instead of "0", the word "GO!" will be displayed.
 * 10 9 8 7 6 5 4 3 2 1 GO!
 * There is a one second delay after each number.
 */
public class Countdown {

	public static void main(String[] args) {
		for (int i=10; i>=0; i--) {//Countdown from 10 to 0
			if(i==0) {
				System.out.println("GO!");
			}
			else {
				System.out.println(i);
			}
			try {
				Thread.sleep(1000);//1 second delay after every "i"
			}
			catch(Exception e) {
			}
		}
	}
}
