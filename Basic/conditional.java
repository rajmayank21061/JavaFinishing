import java.util.Scanner;
public class conditional {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.print("What is your Age: ");
    int age = sc.nextInt();
    if(age>=18){
        System.out.println("You are able to give Vote");
    }
    else{
        System.out.println("You are not able to give Vote");
    }
    //Now we are going on Switch
    System.out.print("Enter the button number: ");
    int button = sc.nextInt();
    switch(button)
    {
        case 1:
        System.out.println("Hello");
        break;
        case 2:
        System.out.println("Namaste");
        break;
        case 3:
        System.out.println("Hi baby");
        break;
        default:
        System.out.println("Hi Guys");
    }
}
}
