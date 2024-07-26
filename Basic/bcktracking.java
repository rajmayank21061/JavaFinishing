class bcktracking{
    public static void backTracking(String str,int ind, String res){
        if(str.length() == 0){
            System.out.println(res);
            return;
        }
        for(int i = 0; i<str.length(); i++){
            char current = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            backTracking(newstr, ind+1, res + current) ;
        }
    }
public static void main( String args[]){
 backTracking("ABC",0,"");
 
}
}   