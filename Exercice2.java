import java.util.Scanner;
class Exercice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre:");
        int num1 = sc.nextInt();
        System.out.println("Veuillez saisir un autre nombre:");
        int num2 = sc.nextInt();
        int max = (num1 >= num2) ? num1 : num2;

        System.out.println("Le maximum de ces deux nombres est " + max);
        
	}

}