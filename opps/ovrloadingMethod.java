class dump {
void add(){
    int a = 4, b = 2;
    int c = a +b;
    System.out.println(c);
}
void add(int a , int b){
    int c = a + b;
    System.out.println(c);
}
void add(int a, double b){
    System.out.println(a+b);
}
public static void main(String[] args) {
    dump opr = new dump();
    opr.add();
    opr.add(5,9.8);
    opr.add(89,11);
}
    
}
