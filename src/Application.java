import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		int points = 0;
		
		//First question
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Velkommen til QuizBiz!");
		System.out.println("1: Hvor mange år er Ole Martin?");
		
		int answer1 = input1.nextInt();
		
		if(answer1 == 24){
			System.out.println("Riktig!");
			points++;
		}else{
			System.out.println("Feil!");
		}
		
		//Seccound question
		Scanner input2 = new Scanner(System.in);
		System.out.println("2: Hvor bor Ole Martin");
		
		String answer2 = input2.nextLine();
		
		if(answer2.equals("Nesodden")){
			System.out.println("Riktig!");
			points++;
		}else{
			System.out.println("Feil!");
		}
		
		//Third Question
		Scanner input3 = new Scanner(System.in);
		System.out.println("3: Hvor høy er Ole Martin?");
		
		int answer3 = input3.nextInt();
		
		if(answer3 == 174){
			System.out.println("Riktig!");
			points++;
		}else{
			System.out.println("Feil!");
		}
		
		if(points == 3){
			System.out.println("Din poengsum ble: " + points);
			System.out.println("Strålende, alle svarene er helt korrekt!");
		}else if(points == 2){
			System.out.println("Din poengsum ble: " + points);
			System.out.println("Bra jobba, nesten alle riktig");
		}else if(points == 1){
			System.out.println("Din poengsum ble: " + points);
			System.out.println("Du må jobbe litt mer, dette var ikke bra");
		}else{
			System.out.println("Din poengsum ble: " + points);
			System.out.println("Totalt KATASTROFE! Hva feiler det deg?");
		}
	}

}
