public class InviteGuest {
    public static int guestInvitation(int n){

        if( n <= 1){
            return 1;
        }
        // for single guest invitaion way
        int single = guestInvitation(n-1);

        //for pairing guest invitation way
        int pair = (n-1) * guestInvitation(n-2);
        
        return single + pair;
    }

    public static void main(String[] args) {
        guestInvitation(4);
    }
}
