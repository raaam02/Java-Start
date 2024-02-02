import java.util.Scanner;

public class GuessGame {
	public static void main(String[] args) {
		Scanner st=new Scanner(System.in);
        int guessnumber =(int)(Math.random()*100);
        int num=0;
        while (num>=0) {
            System.out.print("Enter a number to Guess:");
        num = st.nextInt();
        if (num<guessnumber) {
            System.out.println("Number is small....");
        }
        else if(num==guessnumber){
            System.out.println("Congrats!!!!!!!!!!!!!!");
            break;
        }
        else{
            System.out.println("Number is Large");
        }
        }
        System.out.println("My number was "+guessnumber);
	}
}
