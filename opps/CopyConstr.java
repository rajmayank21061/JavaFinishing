class CopyConstructor {
    String name;
    int salary;
    CopyConstructor(){
        System.out.println("Empty Constructor");
    }
    CopyConstructor( CopyConstructor s){
        this.name = s.name;
        this.salary = s.salary;
    }
    public void printingraidy(){
        System.out.println(this.name);
        System.out.println(this.salary);
    }
}
public class CopyConstr {
   public static void main(String[] args) { 
    CopyConstructor s1 = new CopyConstructor();
     s1.name = "Bablu";
     s1.salary = 29000;
     CopyConstructor s2 = new CopyConstructor(s1);
     s2.printingraidy();
   }
}
