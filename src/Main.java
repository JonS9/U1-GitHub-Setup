import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your bill please: ");
        double bill = scan.nextDouble();
        System.out.println("Please enter the Tip you would like give as a whole number, without percent: ");
        int tip = scan.nextInt();
        System.out.println("How many people would like to pay the tip? Please enter: ");
        int num = scan.nextInt();

        System.out.printf("Bill: $" + bill);
        System.out.println("Tip: " + tip + "%");
        System.out.println("Number of people: " + num + " people");

        double tipamount = ((tip * 0.01) * bill);
        double numtip = (tipamount / num);

        System.out.println(" ");

        String sentence1 = "Tip Amount: $";
        System.out.printf("%s%.2f%n", sentence1, tipamount);

        String sentence2 = "Amount needed to pay in total is: $";
        System.out.printf("%s%.2f%n", sentence2, tipamount + bill);

        String sentence3 = "Amount of Tip payed per person: $";
        System.out.printf("%s%.2f%n", sentence3, numtip);

        String sentence4 = "Amount each person needs to pay: $";
        System.out.printf("%s%.2f%n", sentence4, (bill/num) + numtip);

    }
}