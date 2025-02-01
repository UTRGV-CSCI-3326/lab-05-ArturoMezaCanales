import java.util.Scanner;

public class Input
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Please enter your name: ");
        String name;
		name = scanner.nextLine();
        
        System.out.print("Hello " + name + " please enter your age: ");
        int age;
		age = scanner.nextInt();

        System.out.print("Thank you " + name + " now please enter your weight: ");
        float weight;
		weight = scanner.nextFloat();

        System.out.print("Lastly, do you smoke " + name + "? Enter \"true\" or \"false\" ");
        boolean smoker;
		smoker = scanner.nextBoolean();

        
        System.out.println("Patient information: Name: " + name + " age: " + age + " weight: " + weight + " smoker: " + smoker);

    }
}
