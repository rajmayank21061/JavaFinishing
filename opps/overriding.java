class mass{
    void key(){
        System.out.println("this is super class");
    }
}
class masses extends mass {
    @Override 

    void key(){
        //super.key(); You can also print super class method
        System.out.println("There is a sub class");
    }
class overriding{
    public static void main( String agrs[]){
     mass temp = new masses();
     temp.key();   
    }
}
}