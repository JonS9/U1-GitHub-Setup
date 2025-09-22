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

        System.out.println("Bill: $" + bill);
        System.out.println("Tip: " + tip + "%");
        System.out.println("Number of people: " + num + " people");

        double tipamount = ((tip * 0.01) * bill);
        double numtip = (tipamount / num);

        System.out.println(" ");
        System.out.println("Tip Amount: $" + tipamount);
        System.out.println("Amount needed to pay in total is: $" + (bill + tipamount));
        System.out.println("Amount of Tip payed per person: $" + numtip);
        System.out.println("Amount each person needs to pay: $" + ((bill / num) + numtip));
            }
}
