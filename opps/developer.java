import java.util.Scanner;
interface Client  {
         void input();   // public and abstract
         void output();  //public and abstract
    } 
    class developer implements Client {
    String name; double salary;
    public void input(){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the Name : ");
     name = sc.nextLine();
     System.out.print("Enter the Salary : ");
     salary = sc.nextDouble();
    }
     public void output(){
     System.out.println(name + "  " + salary);
    }
    
    public static void main(String args[]){
     developer q = new developer();
     q.input();
     q.output();
    }
    }
